package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.m1;
import androidx.compose.foundation.text2.input.internal.b;
import androidx.compose.foundation.text2.input.u;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.o2;
import androidx.compose.ui.text.t0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: AndroidTextInputSession.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a:\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000f\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u001a\u0010 \u001a\u00020\u00148\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001d\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/platform/o2;", "Landroidx/compose/foundation/text2/input/internal/m0;", "state", "Landroidx/compose/ui/text/input/z;", "imeOptions", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/y;", "Lkotlin/k2;", "onImeAction", "", "e", "(Landroidx/compose/ui/platform/o2;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/input/z;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/foundation/text2/input/q;", "textFieldValue", "f", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/foundation/text2/input/q;Landroidx/compose/ui/text/input/z;)V", "", "bits", "flag", "", "b", "(II)Z", "", "tag", "Lkotlin/Function0;", "content", "c", "(Ljava/lang/String;Lld/a;)V", "a", "Z", "()V", "TIA_DEBUG", "Ljava/lang/String;", "TAG", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f8553a = false;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f8554b = "AndroidTextInputSession";

    /* compiled from: AndroidTextInputSession.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {50}, m = "platformSpecificTextInputSession", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8555b;

        /* renamed from: c, reason: collision with root package name */
        int f8556c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8555b = obj;
            this.f8556c |= Integer.MIN_VALUE;
            return b.e(null, null, null, null, this);
        }
    }

    /* compiled from: AndroidTextInputSession.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2", f = "AndroidTextInputSession.android.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "", "<anonymous>", "(Lkotlinx/coroutines/r0;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.b$b, reason: collision with other inner class name */
    static final class C0178b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<?>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8557b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8558c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o2 f8559d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m0 f8560e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f8561f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z f8562g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.y, k2> f8563h;

        /* compiled from: AndroidTextInputSession.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.b$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8564b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m0 f8565c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f8566d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z f8567e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var, g gVar, androidx.compose.ui.text.input.z zVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8565c = m0Var;
                this.f8566d = gVar;
                this.f8567e = zVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(g gVar, androidx.compose.ui.text.input.z zVar, androidx.compose.foundation.text2.input.q qVar, androidx.compose.foundation.text2.input.q qVar2) {
                if (!t0.g(qVar.getSelectionInChars(), qVar2.getSelectionInChars()) || !kotlin.jvm.internal.l0.g(qVar.getCompositionInChars(), qVar2.getCompositionInChars())) {
                    int l4 = t0.l(qVar2.getSelectionInChars());
                    int k4 = t0.k(qVar2.getSelectionInChars());
                    t0 compositionInChars = qVar2.getCompositionInChars();
                    int l5 = compositionInChars != null ? t0.l(compositionInChars.getPackedValue()) : -1;
                    t0 compositionInChars2 = qVar2.getCompositionInChars();
                    gVar.c(l4, k4, l5, compositionInChars2 != null ? t0.k(compositionInChars2.getPackedValue()) : -1);
                }
                if (qVar.d(qVar2)) {
                    return;
                }
                int keyboardType = zVar.getKeyboardType();
                androidx.compose.ui.text.input.g0.INSTANCE.getClass();
                if (androidx.compose.ui.text.input.g0.m(keyboardType, androidx.compose.ui.text.input.g0.f21031i)) {
                    return;
                }
                gVar.d();
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f8565c, this.f8566d, this.f8567e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8564b;
                if (i4 == 0) {
                    a1.n(obj);
                    m0 m0Var = this.f8565c;
                    final g gVar = this.f8566d;
                    final androidx.compose.ui.text.input.z zVar = this.f8567e;
                    u.a aVar2 = new u.a() { // from class: androidx.compose.foundation.text2.input.internal.d
                        @Override // androidx.compose.foundation.text2.input.u.a
                        public final void a(androidx.compose.foundation.text2.input.q qVar, androidx.compose.foundation.text2.input.q qVar2) {
                            b.C0178b.a.d(g.this, zVar, qVar, qVar2);
                        }
                    };
                    this.f8564b = 1;
                    if (m0Var.g(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: AndroidTextInputSession.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.input.internal.b$b$b, reason: collision with other inner class name */
        static final class C0179b extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f8568b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0179b(m0 m0Var) {
                super(0);
                this.f8568b = m0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "createInputConnection(value=\"" + ((Object) this.f8568b.k()) + "\")";
            }
        }

        /* compiled from: AndroidTextInputSession.android.kt */
        @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/text2/input/internal/b$b$c", "Landroidx/compose/foundation/text2/input/internal/i0;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "Lkotlin/u;", "block", "c", "(Lld/l;)V", "Landroid/view/KeyEvent;", "keyEvent", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroidx/compose/ui/text/input/y;", "imeAction", "a", "(I)V", "Landroidx/compose/foundation/text2/input/q;", "b", "()Landroidx/compose/foundation/text2/input/q;", "text", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,208:1\n201#2,2:209\n206#2:231\n186#3,20:211\n*S KotlinDebug\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1\n*L\n81#1:209,2\n81#1:231\n81#1:211,20\n*E\n"})
        /* renamed from: androidx.compose.foundation.text2.input.internal.b$b$c */
        public static final class c implements i0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m0 f8569a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f8570b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<androidx.compose.ui.text.input.y, k2> f8571c;

            /* JADX WARN: Multi-variable type inference failed */
            c(m0 m0Var, g gVar, ld.l<? super androidx.compose.ui.text.input.y, k2> lVar) {
                this.f8569a = m0Var;
                this.f8570b = gVar;
                this.f8571c = lVar;
            }

            @Override // androidx.compose.foundation.text2.input.internal.i0
            public void a(int imeAction) {
                ld.l<androidx.compose.ui.text.input.y, k2> lVar = this.f8571c;
                if (lVar != null) {
                    lVar.invoke(androidx.compose.ui.text.input.y.i(imeAction));
                }
            }

            @Override // androidx.compose.foundation.text2.input.internal.i0
            @fg.l
            public androidx.compose.foundation.text2.input.q b() {
                return this.f8569a.k();
            }

            @Override // androidx.compose.foundation.text2.input.internal.i0
            public void c(@fg.l ld.l<? super m, k2> block) {
                androidx.compose.foundation.text2.input.h hVar;
                m0 m0Var = this.f8569a;
                androidx.compose.foundation.text2.input.u uVar = m0Var.textFieldState;
                hVar = m0Var.inputTransformation;
                androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
                androidx.compose.foundation.text2.input.q m4 = uVar.m();
                uVar.getMainBuffer().getChangeTracker().e();
                block.invoke(uVar.getMainBuffer());
                if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
                    return;
                }
                uVar.f(m4, hVar, false, cVar);
            }

            @Override // androidx.compose.foundation.text2.input.internal.i0
            public void sendKeyEvent(@fg.l KeyEvent keyEvent) {
                this.f8570b.sendKeyEvent(keyEvent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0178b(o2 o2Var, m0 m0Var, g gVar, androidx.compose.ui.text.input.z zVar, ld.l<? super androidx.compose.ui.text.input.y, k2> lVar, kotlin.coroutines.d<? super C0178b> dVar) {
            super(2, dVar);
            this.f8559d = o2Var;
            this.f8560e = m0Var;
            this.f8561f = gVar;
            this.f8562g = zVar;
            this.f8563h = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputConnection d(m0 m0Var, androidx.compose.ui.text.input.z zVar, g gVar, ld.l lVar, EditorInfo editorInfo) {
            new C0179b(m0Var);
            c cVar = new c(m0Var, gVar, lVar);
            b.f(editorInfo, m0Var.k(), zVar);
            return new w(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            C0178b c0178b = new C0178b(this.f8559d, this.f8560e, this.f8561f, this.f8562g, this.f8563h, dVar);
            c0178b.f8558c = obj;
            return c0178b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8557b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.k.f((r0) this.f8558c, null, kotlinx.coroutines.t0.UNDISPATCHED, new a(this.f8560e, this.f8561f, this.f8562g, null), 1, null);
                o2 o2Var = this.f8559d;
                final m0 m0Var = this.f8560e;
                final androidx.compose.ui.text.input.z zVar = this.f8562g;
                final g gVar = this.f8561f;
                final ld.l<androidx.compose.ui.text.input.y, k2> lVar = this.f8563h;
                l2 l2Var = new l2() { // from class: androidx.compose.foundation.text2.input.internal.c
                    @Override // androidx.compose.ui.platform.l2
                    public final InputConnection a(EditorInfo editorInfo) {
                        InputConnection d5;
                        d5 = b.C0178b.d(m0.this, zVar, gVar, lVar, editorInfo);
                        return d5;
                    }
                };
                this.f8557b = 1;
                if (o2Var.b(l2Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<?> dVar) {
            return ((C0178b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @m1
    public static /* synthetic */ void a() {
    }

    private static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }

    private static final void c(String str, ld.a<String> aVar) {
    }

    static void d(String str, ld.a aVar, int i4, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@fg.l androidx.compose.ui.platform.o2 r11, @fg.l androidx.compose.foundation.text2.input.internal.m0 r12, @fg.l androidx.compose.ui.text.input.z r13, @fg.m ld.l<? super androidx.compose.ui.text.input.y, kotlin.k2> r14, @fg.l kotlin.coroutines.d<?> r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.text2.input.internal.b.a
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.text2.input.internal.b$a r0 = (androidx.compose.foundation.text2.input.internal.b.a) r0
            int r1 = r0.f8556c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8556c = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.b$a r0 = new androidx.compose.foundation.text2.input.internal.b$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f8555b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f8556c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2b:
            kotlin.a1.n(r15)
            goto L4e
        L2f:
            kotlin.a1.n(r15)
            android.view.View r15 = r11.getView()
            androidx.compose.foundation.text2.input.internal.g r7 = androidx.compose.foundation.text2.input.internal.k.a(r15)
            androidx.compose.foundation.text2.input.internal.b$b r15 = new androidx.compose.foundation.text2.input.internal.b$b
            r10 = 0
            r4 = r15
            r5 = r11
            r6 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f8556c = r3
            java.lang.Object r11 = kotlinx.coroutines.s0.g(r15, r0)
            if (r11 != r1) goto L4e
            return r1
        L4e:
            kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.b.e(androidx.compose.ui.platform.o2, androidx.compose.foundation.text2.input.internal.m0, androidx.compose.ui.text.input.z, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.l android.view.inputmethod.EditorInfo r7, @fg.l androidx.compose.foundation.text2.input.q r8, @fg.l androidx.compose.ui.text.input.z r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.b.f(android.view.inputmethod.EditorInfo, androidx.compose.foundation.text2.input.q, androidx.compose.ui.text.input.z):void");
    }
}
