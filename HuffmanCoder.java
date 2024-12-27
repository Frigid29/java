import java.util.*;
public class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    public class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost){
            this.data = data;
            this.cost= cost;
            this.left = null;
            this.right = null;
        }
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception{
        HashMap<Character,Integer> fmap= new HashMap<>();

        for( int i=0; i<feeder.length(); i++){
            char c = feeder.charAt(i);
            if(fmap.containsKey(c)){
                fmap.put(c, fmap.get(c)+1);
            }else{
                fmap.put(c, 1);
            }
        }
        Heap<Node> minHeap= new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        for(Map.Entry<Character, Integer> entry: entrySet){
            Node node= new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while(minHeap.size()!=1){
            Node first = minHeap.remove();
            Node second = minHeap.remove();
            Node newnode= new Node('\0', first.cost + second.cost);
            newnode.left = first;
            newnode.right = second;
            minHeap.insert(newnode);
        }

        Node ft=minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();
        
        this.initEncoderDecoder(ft,"");

    }

    public void initEncoderDecoder(Node node, String osf){
        //osf = output so far
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }

        initEncoderDecoder(node.left, osf+"0");
        initEncoderDecoder(node.right, osf+"1");
    }

    public String encode(String data){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<data.length(); i++){
            char c = data.charAt(i);
            sb= sb.append(encoder.get(c));
        }
        return sb.toString();
    }
    public String decode(String encoded){
        StringBuilder sb= new StringBuilder();
        StringBuilder key= new StringBuilder();
        for(int i=0; i<encoded.length(); i++){
            key=key.append(encoded.charAt(i));
            if(decoder.containsKey(key.toString())){
                sb=sb.append(decoder.get(key.toString()));
                key=new StringBuilder();;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception{
        String str="abbccda";
        HuffmanCoder hf= new HuffmanCoder(str);

        String cs= hf.encode(str);
        System.out.println(cs);

        String ds= hf.decode(cs);
        System.out.println(ds);
    }
}

