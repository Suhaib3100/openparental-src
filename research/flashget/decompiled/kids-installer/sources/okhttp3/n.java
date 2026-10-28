package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* compiled from: CookieJar.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lokhttp3/n;", "", "Lokhttp3/w;", "url", "", "Lokhttp3/m;", "cookies", "Lkotlin/m2;", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final n f31501a = new Companion.C0489a();

    /* compiled from: CookieJar.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/n$a;", "", "Lokhttp3/n;", "NO_COOKIES", "Lokhttp3/n;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.n$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f31503a = null;

        /* compiled from: CookieJar.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lokhttp3/n$a$a;", "Lokhttp3/n;", "Lokhttp3/w;", "url", "", "Lokhttp3/m;", "cookies", "Lkotlin/m2;", "a", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        private static final class C0489a implements n {
            @Override // okhttp3.n
            public void a(@d5.d w wVar, @d5.d List<m> list) {
                kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("鉴"));
                kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("鉵"));
            }

            @Override // okhttp3.n
            @d5.d
            public List<m> b(@d5.d w url) {
                kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("鉶"));
                return EmptyList.f23167o;
            }
        }

        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    void a(@d5.d w wVar, @d5.d List<m> list);

    @d5.d
    List<m> b(@d5.d w url);
}
