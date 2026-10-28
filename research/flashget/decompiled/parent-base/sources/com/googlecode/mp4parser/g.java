package com.googlecode.mp4parser;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.mp4parser.aspectj.lang.NoAspectBoundException;

/* compiled from: RequiresParseDetailAspect.java */
@jg.f
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static /* synthetic */ Throwable f64071a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g f64072b = null;

    static {
        try {
            a();
        } catch (Throwable th) {
            f64071a = th;
        }
    }

    private static void a() {
        f64072b = new g();
    }

    public static g b() {
        g gVar = f64072b;
        if (gVar != null) {
            return gVar;
        }
        throw new NoAspectBoundException(ProtectedSandApp.s("ᐵ\u0001"), f64071a);
    }

    public static boolean d() {
        return f64072b != null;
    }

    @jg.g("this(com.googlecode.mp4parser.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(com.googlecode.mp4parser.annotations.DoNotParseDetail)) || @annotation(com.googlecode.mp4parser.annotations.ParseDetail))")
    public void c(org.mp4parser.aspectj.lang.c cVar) {
        if (cVar.e() instanceof AbstractBox) {
            if (((AbstractBox) cVar.e()).isParsed()) {
                return;
            }
            ((AbstractBox) cVar.e()).parseDetails();
        } else {
            throw new RuntimeException(ProtectedSandApp.s("ᐶ\u0001") + AbstractBox.class.getName() + ProtectedSandApp.s("ᐷ\u0001"));
        }
    }
}
