package Tasks.crypt.encrypt;

public class EncryptText {
    private int keyCrypt;

    public void setKeyCrypt(int keyCrypt) {
        this.keyCrypt = keyCrypt;
    }

    public int getKeyCrypt() {
        return keyCrypt;
    }

    public String encrypt(String text) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = (char) (c + getKeyCrypt());
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
