package android.content.preferences;

import android.content.Context;
import android.content.core.e;
import android.content.preferences.core.d;
import androidx.annotation.b0;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.u0;
import q3.l;
import t.b;

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00120\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/datastore/preferences/c;", "Lkotlin/properties/e;", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "thisRef", "Lkotlin/reflect/o;", "property", "d", "", "a", "Ljava/lang/String;", "name", "Lt/b;", "b", "Lt/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/c;", "c", "Lq3/l;", "produceMigrations", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/u0;", "scope", "", "e", "Ljava/lang/Object;", "lock", "f", "Landroidx/datastore/core/e;", "INSTANCE", "<init>", "(Ljava/lang/String;Lt/b;Lq3/l;Lkotlinx/coroutines/u0;)V", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class c implements ReadOnlyProperty<Context, e<d>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final b<d> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final l<Context, List<android.content.core.c<d>>> produceMigrations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final u0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @b0("lock")
    @d5.e
    private volatile e<d> INSTANCE;

    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements q3.a<File> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f7097p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ c f7098q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f7097p = context;
            this.f7098q = cVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File n() {
            Context applicationContext = this.f7097p;
            l0.o(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f7098q.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@d5.d String name, @d5.e b<d> bVar, @d5.d l<? super Context, ? extends List<? extends android.content.core.c<d>>> produceMigrations, @d5.d u0 scope) {
        l0.p(name, "name");
        l0.p(produceMigrations, "produceMigrations");
        l0.p(scope, "scope");
        this.name = name;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e<d> a(@d5.d Context thisRef, @d5.d KProperty<?> property) {
        e<d> eVar;
        l0.p(thisRef, "thisRef");
        l0.p(property, "property");
        e<d> eVar2 = this.INSTANCE;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                Context applicationContext = thisRef.getApplicationContext();
                android.content.preferences.core.c cVar = android.content.preferences.core.c.f7106a;
                b<d> bVar = this.corruptionHandler;
                l<Context, List<android.content.core.c<d>>> lVar = this.produceMigrations;
                l0.o(applicationContext, "applicationContext");
                this.INSTANCE = cVar.b(bVar, lVar.N(applicationContext), this.scope, new a(applicationContext, this));
            }
            eVar = this.INSTANCE;
            l0.m(eVar);
        }
        return eVar;
    }
}
