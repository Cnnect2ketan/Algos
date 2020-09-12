public class CompareVersion {

    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        //int minlenth= version1.length()<version2.length()?version1.length():version2.length();
        int minlenth= v1.length<v2.length?v1.length:v2.length;
        int maxlenth= v1.length>v2.length?v1.length:v2.length;
        for(int i=0;i<minlenth;i++){
            Integer charv1=Integer.parseInt(v1[i]);
            Integer charv2=Integer.parseInt(v2[i]);
            if(charv1>charv2)
                return 1;
            if(charv1<charv2)
                return -1;
        }
        if(v1.length<v2.length){
            for(int i=minlenth;i<maxlenth;i++){
                if(Integer.parseInt(v2[i])!=0)
                    return -1;
            }
            return 0;
        }
        if(v1.length>v2.length){
            for(int i=minlenth;i<maxlenth;i++){
                if(Integer.parseInt(v1[i])!=0)
                    return 1;
            }
            return 0;
        }

        return 0;

    }

    public static void main(String[] args) {
        CompareVersion.compareVersion("1.1.0","1");
    }
}
