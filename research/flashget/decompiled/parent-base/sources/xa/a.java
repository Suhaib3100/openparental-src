package xa;

/* compiled from: BTree.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private a f92945a;

    /* renamed from: b, reason: collision with root package name */
    private a f92946b;

    /* renamed from: c, reason: collision with root package name */
    private Object f92947c;

    public void a(String str, Object obj) {
        a aVar;
        if (str.length() == 0) {
            this.f92947c = obj;
            return;
        }
        if (str.charAt(0) == '0') {
            if (this.f92945a == null) {
                this.f92945a = new a();
            }
            aVar = this.f92945a;
        } else {
            if (this.f92946b == null) {
                this.f92946b = new a();
            }
            aVar = this.f92946b;
        }
        aVar.a(str.substring(1), obj);
    }

    public a b(int i4) {
        return i4 == 0 ? this.f92945a : this.f92946b;
    }

    public Object c() {
        return this.f92947c;
    }
}
