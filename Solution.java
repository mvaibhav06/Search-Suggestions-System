class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> out = new ArrayList<>();

        String s = "";
        for(int i=0; i<searchWord.length(); i++){
            char ch = searchWord.charAt(i);
            s += ch;
            List<String> temp = new ArrayList<>();
            for(int j=0; j<products.length; j++){
                StringBuilder sb = new StringBuilder(products[j]);
                int b = s.length();
                if(sb.length() < b){
                    b = sb.length();
                }
                if(sb.substring(0,b).equals(s)){
                    temp.add(products[j]);
                }
            } 
            Collections.sort(temp);
            List<String> search = new ArrayList<>();
            for(int p=0; p<3 && p<temp.size(); p++){
                search.add(temp.get(p));
            }
            out.add(search);
        }
        return out;
    }
}
