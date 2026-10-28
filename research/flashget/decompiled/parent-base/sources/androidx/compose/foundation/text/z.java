package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyMapping.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/c;", "", "shortcutModifier", "Landroidx/compose/foundation/text/y;", "a", "(Lld/l;)Landroidx/compose/foundation/text/y;", "Landroidx/compose/foundation/text/y;", "b", "()Landroidx/compose/foundation/text/y;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final y f8332a = new c(new a(new kotlin.jvm.internal.g1() { // from class: androidx.compose.foundation.text.z.b
        @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
        @fg.m
        public Object get(@fg.m Object obj) {
            return Boolean.valueOf(((androidx.compose.ui.input.key.c) obj).h().isCtrlPressed());
        }
    }));

    /* compiled from: KeyMapping.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/z$a", "Landroidx/compose/foundation/text/y;", "Landroidx/compose/ui/input/key/c;", "event", "Landroidx/compose/foundation/text/w;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/w;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.input.key.c, Boolean> f8333a;

        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super androidx.compose.ui.input.key.c, Boolean> lVar) {
            this.f8333a = lVar;
        }

        @Override // androidx.compose.foundation.text.y
        @fg.m
        public w a(@fg.l KeyEvent event) {
            if (this.f8333a.invoke(androidx.compose.ui.input.key.c.a(event)).booleanValue() && event.isShiftPressed()) {
                if (androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(event), h0.f7413a.x())) {
                    return w.REDO;
                }
                return null;
            }
            if (this.f8333a.invoke(androidx.compose.ui.input.key.c.a(event)).booleanValue()) {
                long a5 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.d()) ? true : androidx.compose.ui.input.key.b.E4(a5, h0Var.n())) {
                    return w.COPY;
                }
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.u())) {
                    return w.PASTE;
                }
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.v())) {
                    return w.CUT;
                }
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.a())) {
                    return w.SELECT_ALL;
                }
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.w())) {
                    return w.REDO;
                }
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.x())) {
                    return w.UNDO;
                }
                return null;
            }
            if (event.isCtrlPressed()) {
                return null;
            }
            if (event.isShiftPressed()) {
                long a6 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var2 = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.i())) {
                    return w.SELECT_LEFT_CHAR;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.j())) {
                    return w.SELECT_RIGHT_CHAR;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.k())) {
                    return w.SELECT_UP;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.h())) {
                    return w.SELECT_DOWN;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.r())) {
                    return w.SELECT_PAGE_UP;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.q())) {
                    return w.SELECT_PAGE_DOWN;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.p())) {
                    return w.SELECT_LINE_START;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.o())) {
                    return w.SELECT_LINE_END;
                }
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.n())) {
                    return w.PASTE;
                }
                return null;
            }
            long a7 = androidx.compose.ui.input.key.e.a(event);
            h0 h0Var3 = h0.f7413a;
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.i())) {
                return w.LEFT_CHAR;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.j())) {
                return w.RIGHT_CHAR;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.k())) {
                return w.UP;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.h())) {
                return w.DOWN;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.r())) {
                return w.PAGE_UP;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.q())) {
                return w.PAGE_DOWN;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.p())) {
                return w.LINE_START;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.o())) {
                return w.LINE_END;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.l())) {
                return w.NEW_LINE;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.c())) {
                return w.DELETE_PREV_CHAR;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.g())) {
                return w.DELETE_NEXT_CHAR;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.s())) {
                return w.PASTE;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.f())) {
                return w.CUT;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.e())) {
                return w.COPY;
            }
            if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.t())) {
                return w.TAB;
            }
            return null;
        }
    }

    /* compiled from: KeyMapping.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/z$c", "Landroidx/compose/foundation/text/y;", "Landroidx/compose/ui/input/key/c;", "event", "Landroidx/compose/foundation/text/w;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/w;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f8335a;

        c(y yVar) {
            this.f8335a = yVar;
        }

        @Override // androidx.compose.foundation.text.y
        @fg.m
        public w a(@fg.l KeyEvent event) {
            w wVar = null;
            if (event.isShiftPressed() && event.isCtrlPressed()) {
                long a5 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.i())) {
                    wVar = w.SELECT_LEFT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(a5, h0Var.j())) {
                    wVar = w.SELECT_RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(a5, h0Var.k())) {
                    wVar = w.SELECT_PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(a5, h0Var.h())) {
                    wVar = w.SELECT_NEXT_PARAGRAPH;
                }
            } else if (event.isCtrlPressed()) {
                long a6 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var2 = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.i())) {
                    wVar = w.LEFT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.j())) {
                    wVar = w.RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.k())) {
                    wVar = w.PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.h())) {
                    wVar = w.NEXT_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.m())) {
                    wVar = w.DELETE_PREV_CHAR;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.g())) {
                    wVar = w.DELETE_NEXT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.c())) {
                    wVar = w.DELETE_PREV_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.b())) {
                    wVar = w.DESELECT;
                }
            } else if (event.isShiftPressed()) {
                long a7 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var3 = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.p())) {
                    wVar = w.SELECT_LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(a7, h0Var3.o())) {
                    wVar = w.SELECT_LINE_RIGHT;
                }
            } else if (event.isAltPressed()) {
                long a8 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var4 = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a8, h0Var4.c())) {
                    wVar = w.DELETE_FROM_LINE_START;
                } else if (androidx.compose.ui.input.key.b.E4(a8, h0Var4.g())) {
                    wVar = w.DELETE_TO_LINE_END;
                }
            }
            return wVar == null ? this.f8335a.a(event) : wVar;
        }
    }

    @fg.l
    public static final y a(@fg.l ld.l<? super androidx.compose.ui.input.key.c, Boolean> lVar) {
        return new a(lVar);
    }

    @fg.l
    public static final y b() {
        return f8332a;
    }
}
