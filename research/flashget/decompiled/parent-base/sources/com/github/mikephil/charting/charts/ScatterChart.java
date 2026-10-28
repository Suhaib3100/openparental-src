package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.data.v;
import com.github.mikephil.charting.renderer.p;
import e8.h;

/* loaded from: classes5.dex */
public class ScatterChart extends BarLineChartBase<v> implements h {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SQUARE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CHEVRON_DOWN;
        public static final a CHEVRON_UP;
        public static final a CIRCLE;
        public static final a CROSS;
        public static final a SQUARE;
        public static final a TRIANGLE;
        public static final a X;
        private final String shapeIdentifier;

        static {
            String s4 = ProtectedSandApp.s("쏲");
            a aVar = new a(s4, 0, s4);
            SQUARE = aVar;
            String s5 = ProtectedSandApp.s("쏳");
            a aVar2 = new a(s5, 1, s5);
            CIRCLE = aVar2;
            String s6 = ProtectedSandApp.s("쏴");
            a aVar3 = new a(s6, 2, s6);
            TRIANGLE = aVar3;
            String s7 = ProtectedSandApp.s("쏵");
            a aVar4 = new a(s7, 3, s7);
            CROSS = aVar4;
            String s10 = ProtectedSandApp.s("쏶");
            a aVar5 = new a(s10, 4, s10);
            X = aVar5;
            String s11 = ProtectedSandApp.s("쏷");
            a aVar6 = new a(s11, 5, s11);
            CHEVRON_UP = aVar6;
            String s12 = ProtectedSandApp.s("쏸");
            a aVar7 = new a(s12, 6, s12);
            CHEVRON_DOWN = aVar7;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        private a(String str, int i4, String str2) {
            this.shapeIdentifier = str2;
        }

        public static a[] getAllDefaultShapes() {
            return new a[]{SQUARE, CIRCLE, TRIANGLE, CROSS, X, CHEVRON_UP, CHEVRON_DOWN};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.shapeIdentifier;
        }
    }

    public ScatterChart(Context context) {
        super(context);
    }

    @Override // e8.h
    public v e() {
        return (v) this.f50233c;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50249s = new p(this, this.f50252v, this.f50251u);
        o0().t0(0.5f);
        o0().s0(0.5f);
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
