package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CreationExtras.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0000¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\u000b\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ll0/a;", "", "T", "Ll0/a$b;", "key", "a", "(Ll0/a$b;)Ljava/lang/Object;", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "map", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0540a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Map<b<?>, Object> map = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ll0/a$a;", "Ll0/a;", "T", "Ll0/a$b;", "key", "a", "(Ll0/a$b;)Ljava/lang/Object;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: l0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0459a extends AbstractC0540a {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final C0459a f29101b = new C0459a();

        private C0459a() {
        }

        @Override // kotlin.AbstractC0540a
        @d5.e
        public <T> T a(@d5.d b<T> key) {
            kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⯤"));
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Ll0/a$b;", "T", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: l0.a$b */
    public interface b<T> {
    }

    @d5.e
    public abstract <T> T a(@d5.d b<T> key);

    @d5.d
    public final Map<b<?>, Object> b() {
        return this.map;
    }
}
