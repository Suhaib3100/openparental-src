package android.content;

import android.content.Context;
import android.content.core.e;
import android.content.core.f;
import android.content.core.j;
import androidx.annotation.b0;
import d5.d;
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

/* compiled from: DataStoreDelegate.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\u0012\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00160\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R,\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/datastore/c;", "T", "Lkotlin/properties/e;", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "thisRef", "Lkotlin/reflect/o;", "property", "d", "", "a", "Ljava/lang/String;", "fileName", "Landroidx/datastore/core/j;", "b", "Landroidx/datastore/core/j;", "serializer", "Lt/b;", "c", "Lt/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/c;", "Lq3/l;", "produceMigrations", "Lkotlinx/coroutines/u0;", "e", "Lkotlinx/coroutines/u0;", "scope", "", "f", "Ljava/lang/Object;", "lock", "g", "Landroidx/datastore/core/e;", "INSTANCE", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/j;Lt/b;Lq3/l;Lkotlinx/coroutines/u0;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class c<T> implements ReadOnlyProperty<Context, e<T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final String fileName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final j<T> serializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final b<T> corruptionHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final l<Context, List<android.content.core.c<T>>> produceMigrations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d
    private final u0 scope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d
    private final Object lock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b0("lock")
    @d5.e
    private volatile e<T> INSTANCE;

    /* compiled from: DataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements q3.a<File> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f6935p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ c<T> f6936q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c<T> cVar) {
            super(0);
            this.f6935p = context;
            this.f6936q = cVar;
        }

        @Override // q3.a
        @d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File n() {
            Context applicationContext = this.f6935p;
            l0.o(applicationContext, "applicationContext");
            return Context.a(applicationContext, ((c) this.f6936q).fileName);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@d String fileName, @d j<T> serializer, @d5.e b<T> bVar, @d l<? super Context, ? extends List<? extends android.content.core.c<T>>> produceMigrations, @d u0 scope) {
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

    @Override // kotlin.properties.ReadOnlyProperty
    @d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e<T> a(@d Context thisRef, @d KProperty<?> property) {
        e<T> eVar;
        l0.p(thisRef, "thisRef");
        l0.p(property, "property");
        e<T> eVar2 = this.INSTANCE;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                Context applicationContext = thisRef.getApplicationContext();
                j<T> jVar = this.serializer;
                b<T> bVar = this.corruptionHandler;
                l<Context, List<android.content.core.c<T>>> lVar = this.produceMigrations;
                l0.o(applicationContext, "applicationContext");
                this.INSTANCE = f.f6957a.b(jVar, bVar, lVar.N(applicationContext), this.scope, new a(applicationContext, this));
            }
            eVar = this.INSTANCE;
            l0.m(eVar);
        }
        return eVar;
    }
}
