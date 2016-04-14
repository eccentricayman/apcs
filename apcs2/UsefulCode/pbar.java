public class pbar {
    public static void main(String[] argv) throws Exception {
        String anim= "|/-\\";
        for (int x =0 ; x > -1 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length());
            System.out.write(data.getBytes());
            Thread.sleep(250);
        }
    }
}
