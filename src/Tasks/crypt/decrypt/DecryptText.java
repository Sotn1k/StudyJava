package Tasks.crypt.decrypt;

public class DecryptText {

    private int keyDeCrypt = 0;

    public void setKeyDeCrypt(int keyCrypt) {
        this.keyDeCrypt = keyCrypt;
    }



    public String decrypt(String text){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = (char) (c - this.keyDeCrypt);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
