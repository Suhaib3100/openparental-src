package xa;

/* compiled from: CharCache.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private char[] f92948a;

    /* renamed from: b, reason: collision with root package name */
    private int f92949b;

    public b(int i4) {
        this.f92948a = new char[i4];
    }

    public void a(char c5) {
        int i4 = this.f92949b;
        char[] cArr = this.f92948a;
        if (i4 < cArr.length - 1) {
            cArr[i4] = c5;
            this.f92949b = i4 + 1;
        }
    }

    public void b(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = this.f92948a;
        int length = cArr.length;
        int i4 = this.f92949b;
        int i5 = length - i4;
        if (charArray.length < i5) {
            i5 = charArray.length;
        }
        System.arraycopy(charArray, 0, cArr, i4, i5);
        this.f92949b += i5;
    }

    public void c() {
        this.f92949b = 0;
    }

    public int d() {
        return this.f92949b;
    }

    public String toString() {
        return new String(this.f92948a, 0, this.f92949b);
    }
}
