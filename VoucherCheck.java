

package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.Voucher;


public class VoucherCheck {
    private List<String> redeemedVouchers;

    public VoucherCheck() {
        
        
        redeemedVouchers=new ArrayList<>();
        try(BufferedReader rd=new BufferedReader(new FileReader("voucherused.txt")))
        {
            String line;
            while((line=rd.readLine())!=null)
            {
               redeemedVouchers.add(line.trim());
            }
        }
        catch(IOException ex)
        {
        ex.printStackTrace();
        }
      
    }

    public boolean checkVoucher(Voucher voucher) {
        return redeemedVouchers.contains(voucher.getVoucherCode());
    }
}
