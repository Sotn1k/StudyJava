package Tasks.crypt.decrypt;

public class DecryptText {

    private int keyDeCrypt;

    public void setKeyDeCrypt(int keyCrypt) {
        this.keyDeCrypt = keyCrypt;
    }

    public int getKeyDeCrypt() {
        return keyDeCrypt;
    }

    public String decrypt(String text){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = (char) (c - getKeyDeCrypt());
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
