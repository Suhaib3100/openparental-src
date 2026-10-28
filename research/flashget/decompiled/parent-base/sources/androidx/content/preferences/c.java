package androidx.content.preferences;

import android.content.Context;
import androidx.annotation.b0;
import androidx.content.preferences.core.d;
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

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/datastore/preferences/c;", "Lkotlin/properties/e;", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "", "name", "Lo1/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Ljava/lang/String;Lo1/b;Lld/l;Lkotlinx/coroutines/r0;)V", "thisRef", "Lkotlin/reflect/o;", "property", "d", "(Landroid/content/Context;Lkotlin/reflect/o;)Landroidx/datastore/core/e;", "a", "Ljava/lang/String;", "b", "Lo1/b;", "c", "Lld/l;", "Lkotlinx/coroutines/r0;", "", "e", "Ljava/lang/Object;", "lock", "f", "Landroidx/datastore/core/e;", "INSTANCE", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements e<Context, androidx.content.core.e<d>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final b<d> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<Context, List<androidx.content.core.c<d>>> produceMigrations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final r0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    @b0("lock")
    private volatile androidx.content.core.e<d> INSTANCE;

    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends n0 implements ld.a<File> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28551b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f28552c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f28551b = context;
            this.f28552c = cVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f28551b;
            l0.o(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f28552c.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l String name, @m b<d> bVar, @l ld.l<? super Context, ? extends List<? extends androidx.content.core.c<d>>> produceMigrations, @l r0 scope) {
        l0.p(name, "name");
        l0.p(produceMigrations, "produceMigrations");
        l0.p(scope, "scope");
        this.name = name;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.e
    @l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public androidx.content.core.e<d> a(@l Context thisRef, @l o<?> property) {
        androidx.content.core.e<d> eVar;
        l0.p(thisRef, "thisRef");
        l0.p(property, "property");
        androidx.content.core.e<d> eVar2 = this.INSTANCE;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    androidx.content.preferences.core.c cVar = androidx.content.preferences.core.c.f28560a;
                    b<d> bVar = this.corruptionHandler;
                    ld.l<Context, List<androidx.content.core.c<d>>> lVar = this.produceMigrations;
                    l0.o(applicationContext, "applicationContext");
                    this.INSTANCE = cVar.b(bVar, lVar.invoke(applicationContext), this.scope, new a(applicationContext, this));
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
