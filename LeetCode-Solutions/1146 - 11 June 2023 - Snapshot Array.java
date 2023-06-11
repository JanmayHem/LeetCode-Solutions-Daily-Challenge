class SnapshotArray {

    private List<TreeMap<Integer, Integer>> tm;
    private int snapID;

    public SnapshotArray(int length) {
        tm = new ArrayList<>();
        for(int i=0; i<length; i++){
            tm.add(new TreeMap<>());
            tm.get(i).put(0,0);
        }    
        snapID=0;
    }
    
    public void set(int index, int val) {
        tm.get(index).put(snapID, val);
    }
    
    public int snap() {
        return snapID++;
    }
    
    public int get(int index, int snapID) {
        return tm.get(index).floorEntry(snapID).getValue();
    }
}
