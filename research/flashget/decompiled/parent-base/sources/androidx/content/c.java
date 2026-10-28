package androidx.content;

import android.content.Context;
import androidx.annotation.b0;
import androidx.content.core.f;
import androidx.content.core.j;
import fg.l;
import fg.m;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.properties.e;
import kotlin.reflect.o;
import kotlinx.coroutines.r0;
import o1.b;

/* compiled from: DataStoreDelegate.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00020\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/datastore/c;", "T", "Lkotlin/properties/e;", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "", "fileName", "Landroidx/datastore/core/j;", "serializer", "Lo1/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/j;Lo1/b;Lld/l;Lkotlinx/coroutines/r0;)V", "thisRef", "Lkotlin/reflect/o;", "property", "d", "(Landroid/content/Context;Lkotlin/reflect/o;)Landroidx/datastore/core/e;", "a", "Ljava/lang/String;", "b", "Landroidx/datastore/core/j;", "c", "Lo1/b;", "Lld/l;", "e", "Lkotlinx/coroutines/r0;", "", "f", "Ljava/lang/Object;", "lock", "g", "Landroidx/datastore/core/e;", "INSTANCE", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class c<T> implements e<Context, androidx.content.core.e<T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String fileName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final j<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final b<T> corruptionHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<Context, List<androidx.content.core.c<T>>> produceMigrations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final r0 scope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final Object lock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    @b0("lock")
    private volatile androidx.content.core.e<T> INSTANCE;

    /* compiled from: DataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "T"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends n0 implements ld.a<File> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f28390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c<T> cVar) {
            super(0);
            this.f28389b = context;
            this.f28390c = cVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f28389b;
            l0.o(applicationContext, "applicationContext");
            return Context.a(applicationContext, ((c) this.f28390c).fileName);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l String fileName, @l j<T> serializer, @m b<T> bVar, @l ld.l<? super Context, ? extends List<? extends androidx.content.core.c<T>>> produceMigrations, @l r0 scope) {
        l0.p(fileName, "fileName");
        l0.p(serializer, "serializer");
        l0.p(produceMigrations, "produceMigrations");
        l0.p(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.e
    @l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public androidx.content.core.e<T> a(@l Context thisRef, @l o<?> property) {
        androidx.content.core.e<T> eVar;
        l0.p(thisRef, "thisRef");
        l0.p(property, "property");
        androidx.content.core.e<T> eVar2 = this.INSTANCE;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    j<T> jVar = this.serializer;
                    b<T> bVar = this.corruptionHandler;
                    ld.l<Context, List<androidx.content.core.c<T>>> lVar = this.produceMigrations;
                    l0.o(applicationContext, "applicationContext");
                    this.INSTANCE = f.f28411a.b(jVar, bVar, lVar.invoke(applicationContext), this.scope, new a(applicationContext, this));
                }
                eVar = this.INSTANCE;
                l0.m(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
