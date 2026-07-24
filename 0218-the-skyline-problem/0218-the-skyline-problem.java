class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        //store krenge sare start nad end of events ko
        List<int[]> events = new ArrayList<>();
        for(int[] b : buildings){
            events.add(new int[]{b[0], -b[2]});
            // hm yaha height ko chek krenge k negative toh na hai and event ko strt krenge
            //event ko end krenge
            events.add(new int[]{b[1], b[2]});
        }

            //sorting krenge ge event ji
            Collections.sort(events, (a, b) -> {

                //agar x coordinate se sort kroge toh
                if(a[0] != b[0])
                   return a[0]-b[0];

                //agar event ko start krenge(-ht) pehle ata hai toh
                return a[1] - b[1];
            });

            //max heap
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            maxHeap.offer(0);
            int prevMax = 0;
            List<List<Integer>> answer = new ArrayList<>();
            for(int[] event : events){
                int x = event[0];
                int h = event[1];

                if(h < 0){
                    maxHeap.offer(-h);
                }else{
                    maxHeap.remove(h);
                }


            

            //ground level always exist
            int currentMax = maxHeap.peek();

            //agar skyline change hojaie toh
            if(currentMax != prevMax){
                answer.add(Arrays.asList(x,currentMax));
                prevMax = currentMax;
            }
        }
        return answer;
    }
}