package eg;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: HandshakedataImpl1.java */
/* loaded from: classes6.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f73776a;

    /* renamed from: b, reason: collision with root package name */
    private TreeMap<String, String> f73777b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // eg.c
    public void b(String str, String str2) {
        this.f73777b.put(str, str2);
    }

    @Override // eg.f
    public boolean e(String str) {
        return this.f73777b.containsKey(str);
    }

    @Override // eg.f
    public Iterator<String> f() {
        return Collections.unmodifiableSet(this.f73777b.keySet()).iterator();
    }

    @Override // eg.f
    public byte[] getContent() {
        return this.f73776a;
    }

    @Override // eg.c
    public void j(byte[] bArr) {
        this.f73776a = bArr;
    }

    @Override // eg.f
    public String k(String str) {
        String str2 = this.f73777b.get(str);
        return str2 == null ? "" : str2;
    }
}
