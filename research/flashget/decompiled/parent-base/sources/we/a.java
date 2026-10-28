package we;

/* compiled from: Processor.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC1404a f92884a;

    /* renamed from: b, reason: collision with root package name */
    private final b f92885b;

    /* compiled from: Processor.java */
    /* renamed from: we.a$a, reason: collision with other inner class name */
    public enum EnumC1404a {
        BIT_32("32-bit"),
        BIT_64("64-bit"),
        UNKNOWN("Unknown");

        private final String label;

        EnumC1404a(String str) {
            this.label = str;
        }

        public String getLabel() {
            return this.label;
        }
    }

    /* compiled from: Processor.java */
    public enum b {
        X86,
        IA_64,
        PPC,
        UNKNOWN
    }

    public a(EnumC1404a enumC1404a, b bVar) {
        this.f92884a = enumC1404a;
        this.f92885b = bVar;
    }

    public EnumC1404a a() {
        return this.f92884a;
    }

    public b b() {
        return this.f92885b;
    }

    public boolean c() {
        return EnumC1404a.BIT_32.equals(this.f92884a);
    }

    public boolean d() {
        return EnumC1404a.BIT_64.equals(this.f92884a);
    }

    public boolean e() {
        return b.IA_64.equals(this.f92885b);
    }

    public boolean f() {
        return b.PPC.equals(this.f92885b);
    }

    public boolean g() {
        return b.X86.equals(this.f92885b);
    }
}
