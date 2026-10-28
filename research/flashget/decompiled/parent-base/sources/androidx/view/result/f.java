package androidx.view.result;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: ActivityResultCaller.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, d2 = {"Landroidx/activity/result/f;", "I", "O", "Landroidx/activity/result/h;", "Lkotlin/k2;", "launcher", "Lb/a;", "callerContract", "callerInput", "<init>", "(Landroidx/activity/result/h;Lb/a;Ljava/lang/Object;)V", "input", "Landroidx/core/app/e;", "options", "i", "(Lkotlin/k2;Landroidx/core/app/e;)V", "d", "()V", "a", "()Lb/a;", "Landroidx/activity/result/h;", "g", "()Landroidx/activity/result/h;", "b", "Lb/a;", "e", "c", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "Lkotlin/b0;", "h", "resultContract", "activity-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<I, O> extends h<k2> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final h<I> launcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final b.a<I, O> callerContract;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final I callerInput;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 resultContract = c0.c(new a(this));

    /* compiled from: ActivityResultCaller.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "androidx/activity/result/f$a$a", "a", "()Landroidx/activity/result/f$a$a;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<C0013a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<I, O> f619b;

        /* compiled from: ActivityResultCaller.kt */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/result/f$a$a", "Lb/a;", "Lkotlin/k2;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lkotlin/k2;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Object;", "activity-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.activity.result.f$a$a, reason: collision with other inner class name */
        public static final class C0013a extends b.a<k2, O> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f<I, O> f620a;

            C0013a(f<I, O> fVar) {
                this.f620a = fVar;
            }

            @Override // b.a
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(@l Context context, @l k2 input) {
                return this.f620a.e().createIntent(context, this.f620a.f());
            }

            @Override // b.a
            public O parseResult(int resultCode, @m Intent intent) {
                return this.f620a.e().parseResult(resultCode, intent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<I, O> fVar) {
            super(0);
            this.f619b = fVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0013a invoke() {
            return new C0013a(this.f619b);
        }
    }

    public f(@l h<I> hVar, @l b.a<I, O> aVar, I i4) {
        this.launcher = hVar;
        this.callerContract = aVar;
        this.callerInput = i4;
    }

    @Override // androidx.view.result.h
    @l
    public b.a<k2, ?> a() {
        return h();
    }

    @Override // androidx.view.result.h
    public void d() {
        this.launcher.d();
    }

    @l
    public final b.a<I, O> e() {
        return this.callerContract;
    }

    public final I f() {
        return this.callerInput;
    }

    @l
    public final h<I> g() {
        return this.launcher;
    }

    @l
    public final b.a<k2, O> h() {
        return (b.a) this.resultContract.getValue();
    }

    @Override // androidx.view.result.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(@l k2 input, @m e options) {
        this.launcher.c(this.callerInput, options);
    }
}
