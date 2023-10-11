package BlockChain;

import java.time.DateTimeException;
import java.util.Date;

class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce = 0;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = caculateHash();
    }

    public String caculateHash() {
        String caculateHash = StringUtil.applySha256(previousHash
                + Long.toString(timeStamp)
                + data);
        return caculateHash;
    }

    public void MineBlock(int difficulty) {
        var target = new String(new char[difficulty]).replace('0', '0');
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = caculateHash();
        }
        System.out.println("Block Mined!!" + hash);
    }
}
