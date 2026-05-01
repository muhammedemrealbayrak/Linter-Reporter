public class AnalizDosyasi {

    // Priority 3: Kullanılmayan alanlar
    private int a, b, c;

    public void testMetodu() {

        // Priority 1 (KRİTİK): Finalize metodunu manuel çağırmak.
        // Bu bellek yönetimini bozar ve sistemin çökmesine neden olabilir.
        this.finalize();

        // Priority 2 (YÜKSEK): Boş catch bloğu
        try {
            int sonuc = 10 / 0;
        } catch (Exception ex) { }

        // Priority 3: Koşulsuz if
        if (true) { }

        // Priority 4: İsimlendirme hatası
        int z = 0;

        this.anlamsizMetod();
    }

    private void anlamsizMetod() {
        // Priority 2: Yüksek karmaşıklık
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                for(int k=0; k<5; k++) {
                    System.out.print(i+j+k);
                }
            }
        }
    }

    // Priority 1 veya 2: Nesne temizleme metodunu boş bırakmak
    @Override
    protected void finalize() throws Throwable {
        // Boş bırakılması ciddi bir kaynak sızıntısıdır.
        super.finalize();
    }
}