package question2;

import utils.VoucherCheck;
import gui.VoucherAppGUI;
        

public class Question2 {

    
    public static void main(String[] args) {
        VoucherCheck voucherCheck = new VoucherCheck();
        VoucherAppGUI app = new VoucherAppGUI(voucherCheck);
        app.setVisible(true);
    }
    
}
