package githubOrnekleriBilgisayarKavramlari;

import java.io.IOException;
import java.util.Scanner;
public class KacGunluksunuz {
	public static boolean artikYilHesapla(int yil) {
        boolean artik = false;
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;
        return artik;
	}
	public static int gunHesapla(int ay,int oncekiYil) {
		int ayDegeri = 0;
		switch (ay) {
			case 1: ayDegeri = 31;break;
			case 2: if(artikYilHesapla(oncekiYil)) {
						ayDegeri = 29;break;
					}
					else {
						ayDegeri = 28;break;
					}
			case 3: ayDegeri = 31;break;
			case 4: ayDegeri = 30;break;
			case 5: ayDegeri = 31;break;
			case 6: ayDegeri = 30;break;
			case 7: ayDegeri = 31;break;
			case 8: ayDegeri = 31;break;
			case 9: ayDegeri = 30;break;
			case 10: ayDegeri = 31;break;
			case 11: ayDegeri = 30;break;
			case 12: ayDegeri = 31;break;
		}
		return ayDegeri;
	}
	
    public static void main(String[] args) throws IOException {
		int bugunGun, bugunAy, bugunYil, oncekiGun, oncekiAy, oncekiYil;
		Scanner s = new Scanner(System.in);
		System.out.print("Bugünün tarihininin gununu giriniz:");
		bugunGun = s.nextInt();
		System.out.print("Bugünün tarihininin ayini giriniz:");
		bugunAy = s.nextInt();
		System.out.print("Bugünün tarihininin yilini giriniz:");
		bugunYil = s.nextInt();
		System.out.print("Onceki tarihin gununu giriniz:");
		oncekiGun = s.nextInt();
		System.out.print("Onceki tarihin ayini giriniz:");
		oncekiAy = s.nextInt();
		System.out.print("Onceki tarihin yilini giriniz:");
		oncekiYil = s.nextInt();
		//12.03.2020
		//11.02.2021
		int ayDegeri = 0;
		int toplam = 0;
		int yil = oncekiYil;
		int ay = oncekiAy;
		int gun = oncekiGun;
		while((yil!=bugunYil)||(ay!=bugunAy)||(gun!=bugunGun)){
			ayDegeri = gunHesapla(ay,yil);
			if((yil==bugunYil)&&(ay==bugunAy)) {
				ayDegeri = bugunGun;
			}
			toplam += (ayDegeri-gun);
			gun = 0;
			ay++;
			if((yil==bugunYil)&&(ay==bugunAy)) {
				toplam += (bugunGun-gun);
				gun=bugunGun;
			}
			if(ay == 13) {
				ay=1;
				yil++;
			}
		}
		System.out.println("toplam gün sayisi: "+toplam);
    }
}
		