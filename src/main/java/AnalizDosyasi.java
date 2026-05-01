public class AnalizDosyasi {

    // Priority 3: Kullanılmayan private alanlar (Standart Temiz Kod İhlali)
    private int a, b, c, d, e;

    public void testMetodu() throws Throwable {

        // --- PRIORITY 1 (KRİTİK) ---
        // Kural: AvoidThrowingRawExceptionTypes
        // Throwable fırlatmak, hata yönetim hiyerarşisini bozar ve en üst seviye hatadır.
        if (System.currentTimeMillis() == 0) {
            throw new Throwable("Kritik Hata!");
        }

        // --- PRIORITY 2 (YÜKSEK) ---
        // Kural: EmptyCatchBlock
        // Hataları sessizce yutmak (gizlemek) profesyonel yazılımda büyük bir risktir.
        try {
            int sonuc = 10 / 0;
        } catch (Exception ex) {
            // İçi boş bırakıldı!
        }

        // --- PRIORITY 3 (ORTA) ---
        // Kural: UnconditionalIfStatement / EmptyControlStatement
        // Her zaman true olan ve içi boş olan if bloğu gereksiz yer kaplar.
        if (true) {
        }

        // --- PRIORITY 4 (DÜŞÜK) ---
        // Kural: ShortVariable
        // 'z' gibi tek harfli değişken isimleri kodun okunabilirliğini azaltır.
        int z = 0;

        this.anlamsizKarmaşıklık();
    }

    private void anlamsizKarmaşıklık() {
        // Priority 2: Cognitive Complexity (Bilişsel Karmaşıklık)
        // İç içe geçmiş döngüler kodun anlaşılmasını ve bakımını zorlaştırır.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    // Priority 2: DoNotCallGarbageCollectionExplicitly
    public void temizlikYap() {
        // Bellek temizleyicisini (GC) manuel çağırmak sistem performansını kilitler.
        System.gc();
    }
}