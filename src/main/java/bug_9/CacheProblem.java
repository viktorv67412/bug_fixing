package bug_9;


//????????????)))
public class CacheProblem {
    String cache;

    public static void main(String[] args) {
        final CacheProblem cacheProblem = new CacheProblem();
        cacheProblem.fullCacheInformation(cacheProblem.getCache());
        //cacheProblem.setCache("cache");
        System.out.println(cacheProblem.cache.equals("cache"));//hould be true, please provide few variants to fix this problem,
    }


    public void fullCacheInformation(String cache) {
        //cache = "cacheInfo";
        this.cache = "cache";
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }
}
