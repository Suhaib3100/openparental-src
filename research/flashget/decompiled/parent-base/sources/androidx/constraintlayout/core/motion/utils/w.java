package androidx.constraintlayout.core.motion.utils;

/* compiled from: TypedValues.java */
/* loaded from: classes.dex */
public interface w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22396a = "CUSTOM";

    /* renamed from: b, reason: collision with root package name */
    public static final int f22397b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22398c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f22399d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f22400e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f22401f = 100;

    /* renamed from: g, reason: collision with root package name */
    public static final int f22402g = 101;

    /* compiled from: TypedValues.java */
    public interface a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f22404b = 301;

        /* renamed from: c, reason: collision with root package name */
        public static final int f22405c = 302;

        /* renamed from: d, reason: collision with root package name */
        public static final int f22406d = 303;

        /* renamed from: e, reason: collision with root package name */
        public static final int f22407e = 304;

        /* renamed from: f, reason: collision with root package name */
        public static final int f22408f = 305;

        /* renamed from: g, reason: collision with root package name */
        public static final int f22409g = 306;

        /* renamed from: h, reason: collision with root package name */
        public static final int f22410h = 307;

        /* renamed from: i, reason: collision with root package name */
        public static final int f22411i = 308;

        /* renamed from: j, reason: collision with root package name */
        public static final int f22412j = 309;

        /* renamed from: k, reason: collision with root package name */
        public static final int f22413k = 310;

        /* renamed from: l, reason: collision with root package name */
        public static final int f22414l = 311;

        /* renamed from: m, reason: collision with root package name */
        public static final int f22415m = 312;

        /* renamed from: n, reason: collision with root package name */
        public static final int f22416n = 313;

        /* renamed from: o, reason: collision with root package name */
        public static final int f22417o = 314;

        /* renamed from: p, reason: collision with root package name */
        public static final int f22418p = 315;

        /* renamed from: q, reason: collision with root package name */
        public static final int f22419q = 316;

        /* renamed from: r, reason: collision with root package name */
        public static final int f22420r = 317;

        /* renamed from: s, reason: collision with root package name */
        public static final int f22421s = 318;
        public static final String A = "rotationX";

        /* renamed from: a, reason: collision with root package name */
        public static final String f22403a = "KeyAttributes";
        public static final String B = "rotationY";
        public static final String C = "rotationZ";
        public static final String D = "scaleX";
        public static final String E = "scaleY";
        public static final String F = "pivotX";
        public static final String G = "pivotY";
        public static final String H = "progress";
        public static final String I = "pathRotate";
        public static final String J = "easing";
        public static final String K = "CUSTOM";
        public static final String L = "frame";
        public static final String M = "target";
        public static final String N = "pivotTarget";

        /* renamed from: t, reason: collision with root package name */
        public static final String f22422t = "curveFit";

        /* renamed from: u, reason: collision with root package name */
        public static final String f22423u = "visibility";

        /* renamed from: v, reason: collision with root package name */
        public static final String f22424v = "alpha";

        /* renamed from: w, reason: collision with root package name */
        public static final String f22425w = "translationX";

        /* renamed from: x, reason: collision with root package name */
        public static final String f22426x = "translationY";

        /* renamed from: y, reason: collision with root package name */
        public static final String f22427y = "translationZ";

        /* renamed from: z, reason: collision with root package name */
        public static final String f22428z = "elevation";
        public static final String[] O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", "frame", "target", "pivotTarget"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c5;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -880905839:
                    if (str.equals("target")) {
                        c5 = '\f';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c5 = org.apache.commons.lang3.m.f86065d;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c5 = 14;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 97692013:
                    if (str.equals("frame")) {
                        c5 = 15;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c5 = 16;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c5 = 17;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1167159411:
                    if (str.equals("pivotTarget")) {
                        c5 = 18;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c5 = 19;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return f22420r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return 101;
                case '\r':
                    return 307;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return f22419q;
                case 18:
                    return f22421s;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 100) {
                return 2;
            }
            if (i4 == 101) {
                return 8;
            }
            switch (i4) {
                case 301:
                case 302:
                    return 2;
                case 303:
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                case f22419q /* 316 */:
                    return 4;
                case f22420r /* 317 */:
                case f22421s /* 318 */:
                    return 8;
                default:
                    return -1;
            }
        }
    }

    /* compiled from: TypedValues.java */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f22429a = "Custom";

        /* renamed from: b, reason: collision with root package name */
        public static final String f22430b = "integer";

        /* renamed from: c, reason: collision with root package name */
        public static final String f22431c = "float";

        /* renamed from: d, reason: collision with root package name */
        public static final String f22432d = "color";

        /* renamed from: e, reason: collision with root package name */
        public static final String f22433e = "string";

        /* renamed from: f, reason: collision with root package name */
        public static final String f22434f = "boolean";

        /* renamed from: g, reason: collision with root package name */
        public static final String f22435g = "dimension";

        /* renamed from: h, reason: collision with root package name */
        public static final String f22436h = "refrence";

        /* renamed from: i, reason: collision with root package name */
        public static final String[] f22437i = {"float", "color", "string", "boolean", "dimension", "refrence"};

        /* renamed from: j, reason: collision with root package name */
        public static final int f22438j = 900;

        /* renamed from: k, reason: collision with root package name */
        public static final int f22439k = 901;

        /* renamed from: l, reason: collision with root package name */
        public static final int f22440l = 902;

        /* renamed from: m, reason: collision with root package name */
        public static final int f22441m = 903;

        /* renamed from: n, reason: collision with root package name */
        public static final int f22442n = 904;

        /* renamed from: o, reason: collision with root package name */
        public static final int f22443o = 905;

        /* renamed from: p, reason: collision with root package name */
        public static final int f22444p = 906;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c5;
            str.getClass();
            switch (str.hashCode()) {
                case -1095013018:
                    if (str.equals("dimension")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -710953590:
                    if (str.equals("refrence")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 64711720:
                    if (str.equals("boolean")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 97526364:
                    if (str.equals("float")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return f22443o;
                case 1:
                    return f22441m;
                case 2:
                    return f22444p;
                case 3:
                    return f22442n;
                case 4:
                    return f22440l;
                case 5:
                    return f22439k;
                case 6:
                    return f22438j;
                default:
                    return -1;
            }
        }
    }

    /* compiled from: TypedValues.java */
    public interface c {

        /* renamed from: b, reason: collision with root package name */
        public static final int f22446b = 401;

        /* renamed from: c, reason: collision with root package name */
        public static final int f22447c = 402;

        /* renamed from: d, reason: collision with root package name */
        public static final int f22448d = 403;

        /* renamed from: e, reason: collision with root package name */
        public static final int f22449e = 304;

        /* renamed from: f, reason: collision with root package name */
        public static final int f22450f = 305;

        /* renamed from: g, reason: collision with root package name */
        public static final int f22451g = 306;

        /* renamed from: h, reason: collision with root package name */
        public static final int f22452h = 307;

        /* renamed from: i, reason: collision with root package name */
        public static final int f22453i = 308;

        /* renamed from: j, reason: collision with root package name */
        public static final int f22454j = 309;

        /* renamed from: k, reason: collision with root package name */
        public static final int f22455k = 310;

        /* renamed from: l, reason: collision with root package name */
        public static final int f22456l = 311;

        /* renamed from: m, reason: collision with root package name */
        public static final int f22457m = 312;

        /* renamed from: n, reason: collision with root package name */
        public static final int f22458n = 313;

        /* renamed from: o, reason: collision with root package name */
        public static final int f22459o = 314;

        /* renamed from: p, reason: collision with root package name */
        public static final int f22460p = 315;

        /* renamed from: q, reason: collision with root package name */
        public static final int f22461q = 416;

        /* renamed from: r, reason: collision with root package name */
        public static final int f22462r = 420;

        /* renamed from: s, reason: collision with root package name */
        public static final int f22463s = 421;

        /* renamed from: t, reason: collision with root package name */
        public static final int f22464t = 422;

        /* renamed from: u, reason: collision with root package name */
        public static final int f22465u = 423;

        /* renamed from: v, reason: collision with root package name */
        public static final int f22466v = 424;

        /* renamed from: w, reason: collision with root package name */
        public static final int f22467w = 425;
        public static final String A = "translationX";

        /* renamed from: a, reason: collision with root package name */
        public static final String f22445a = "KeyCycle";
        public static final String B = "translationY";
        public static final String C = "translationZ";
        public static final String D = "elevation";
        public static final String E = "rotationX";
        public static final String F = "rotationY";
        public static final String G = "rotationZ";
        public static final String H = "scaleX";
        public static final String I = "scaleY";
        public static final String J = "pivotX";
        public static final String K = "pivotY";
        public static final String L = "progress";
        public static final String M = "pathRotate";
        public static final String N = "easing";
        public static final String O = "waveShape";
        public static final String P = "customWave";
        public static final String Q = "period";
        public static final String R = "offset";
        public static final String S = "phase";

        /* renamed from: x, reason: collision with root package name */
        public static final String f22468x = "curveFit";

        /* renamed from: y, reason: collision with root package name */
        public static final String f22469y = "visibility";

        /* renamed from: z, reason: collision with root package name */
        public static final String f22470z = "alpha";
        public static final String[] T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", "customWave", "period", "offset", "phase"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c5;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c5 = '\f';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c5 = org.apache.commons.lang3.m.f86065d;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c5 = 14;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c5 = 15;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return 420;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return 403;
                case '\r':
                    return 401;
                case 14:
                    return 416;
                case 15:
                    return 402;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 100) {
                return 2;
            }
            if (i4 == 101) {
                return 8;
            }
            if (i4 == 416) {
                return 4;
            }
            if (i4 == 420 || i4 == 421) {
                return 8;
            }
            switch (i4) {
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                    return 4;
                default:
                    switch (i4) {
                        case 401:
                        case 402:
                            return 2;
                        case 403:
                            return 4;
                        default:
                            switch (i4) {
                                case 423:
                                case 424:
                                case f22467w /* 425 */:
                                    return 4;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    /* compiled from: TypedValues.java */
    public interface d {

        /* renamed from: d, reason: collision with root package name */
        public static final int f22474d = 600;

        /* renamed from: e, reason: collision with root package name */
        public static final int f22475e = 601;

        /* renamed from: a, reason: collision with root package name */
        public static final String f22471a = "MotionScene";

        /* renamed from: b, reason: collision with root package name */
        public static final String f22472b = "defaultDuration";

        /* renamed from: c, reason: collision with root package name */
        public static final String f22473c = "layoutDuringTransition";

        /* renamed from: f, reason: collision with root package name */
        public static final String[] f22476f = {"defaultDuration", "layoutDuringTransition"};

        static int a(String str) {
            str.getClass();
            if (str.equals("defaultDuration")) {
                return 600;
            }
            return !str.equals("layoutDuringTransition") ? -1 : 601;
        }

        static int getType(int i4) {
            if (i4 != 600) {
                return i4 != 601 ? -1 : 1;
            }
            return 2;
        }
    }

    /* compiled from: TypedValues.java */
    public interface e {
        public static final int A = 611;
        public static final int B = 612;

        /* renamed from: a, reason: collision with root package name */
        public static final String f22477a = "Motion";

        /* renamed from: b, reason: collision with root package name */
        public static final String f22478b = "Stagger";

        /* renamed from: c, reason: collision with root package name */
        public static final String f22479c = "PathRotate";

        /* renamed from: d, reason: collision with root package name */
        public static final String f22480d = "QuantizeMotionPhase";

        /* renamed from: e, reason: collision with root package name */
        public static final String f22481e = "TransitionEasing";

        /* renamed from: f, reason: collision with root package name */
        public static final String f22482f = "QuantizeInterpolator";

        /* renamed from: g, reason: collision with root package name */
        public static final String f22483g = "AnimateRelativeTo";

        /* renamed from: h, reason: collision with root package name */
        public static final String f22484h = "AnimateCircleAngleTo";

        /* renamed from: i, reason: collision with root package name */
        public static final String f22485i = "PathMotionArc";

        /* renamed from: j, reason: collision with root package name */
        public static final String f22486j = "DrawPath";

        /* renamed from: k, reason: collision with root package name */
        public static final String f22487k = "PolarRelativeTo";

        /* renamed from: l, reason: collision with root package name */
        public static final String f22488l = "QuantizeMotionSteps";

        /* renamed from: m, reason: collision with root package name */
        public static final String f22489m = "QuantizeInterpolatorType";

        /* renamed from: n, reason: collision with root package name */
        public static final String f22490n = "QuantizeInterpolatorID";

        /* renamed from: o, reason: collision with root package name */
        public static final String[] f22491o = {"Stagger", "PathRotate", "QuantizeMotionPhase", "TransitionEasing", "QuantizeInterpolator", "AnimateRelativeTo", "AnimateCircleAngleTo", "PathMotionArc", "DrawPath", "PolarRelativeTo", "QuantizeMotionSteps", "QuantizeInterpolatorType", "QuantizeInterpolatorID"};

        /* renamed from: p, reason: collision with root package name */
        public static final int f22492p = 600;

        /* renamed from: q, reason: collision with root package name */
        public static final int f22493q = 601;

        /* renamed from: r, reason: collision with root package name */
        public static final int f22494r = 602;

        /* renamed from: s, reason: collision with root package name */
        public static final int f22495s = 603;

        /* renamed from: t, reason: collision with root package name */
        public static final int f22496t = 604;

        /* renamed from: u, reason: collision with root package name */
        public static final int f22497u = 605;

        /* renamed from: v, reason: collision with root package name */
        public static final int f22498v = 606;

        /* renamed from: w, reason: collision with root package name */
        public static final int f22499w = 607;

        /* renamed from: x, reason: collision with root package name */
        public static final int f22500x = 608;

        /* renamed from: y, reason: collision with root package name */
        public static final int f22501y = 609;

        /* renamed from: z, reason: collision with root package name */
        public static final int f22502z = 610;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c5;
            str.getClass();
            switch (str.hashCode()) {
                case -2033446275:
                    if (str.equals("AnimateCircleAngleTo")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1532277420:
                    if (str.equals("QuantizeMotionPhase")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1529145600:
                    if (str.equals("QuantizeMotionSteps")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1498310144:
                    if (str.equals("PathRotate")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1030753096:
                    if (str.equals("QuantizeInterpolator")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -762370135:
                    if (str.equals("DrawPath")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -232872051:
                    if (str.equals("Stagger")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1138491429:
                    if (str.equals("PolarRelativeTo")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1539234834:
                    if (str.equals("QuantizeInterpolatorType")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1583722451:
                    if (str.equals("QuantizeInterpolatorID")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1639368448:
                    if (str.equals("TransitionEasing")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1900899336:
                    if (str.equals("AnimateRelativeTo")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2109694967:
                    if (str.equals("PathMotionArc")) {
                        c5 = '\f';
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return f22498v;
                case 1:
                    return f22494r;
                case 2:
                    return f22502z;
                case 3:
                    return 601;
                case 4:
                    return f22496t;
                case 5:
                    return f22500x;
                case 6:
                    return 600;
                case 7:
                    return f22501y;
                case '\b':
                    return A;
                case '\t':
                    return B;
                case '\n':
                    return f22495s;
                case 11:
                    return f22497u;
                case '\f':
                    return f22499w;
                default:
                    return -1;
            }
        }
    }

    /* compiled from: TypedValues.java */
    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final String f22503a = "dragscale";

        /* renamed from: b, reason: collision with root package name */
        public static final String f22504b = "dragthreshold";

        /* renamed from: c, reason: collision with root package name */
        public static final String f22505c = "maxvelocity";

        /* renamed from: d, reason: collision with root package name */
        public static final String f22506d = "maxacceleration";

        /* renamed from: e, reason: collision with root package name */
        public static final String f22507e = "springmass";

        /* renamed from: f, reason: collision with root package name */
        public static final String f22508f = "springstiffness";

        /* renamed from: g, reason: collision with root package name */
        public static final String f22509g = "springdamping";

        /* renamed from: h, reason: collision with root package name */
        public static final String f22510h = "springstopthreshold";

        /* renamed from: i, reason: collision with root package name */
        public static final String f22511i = "dragdirection";

        /* renamed from: j, reason: collision with root package name */
        public static final String f22512j = "touchanchorid";

        /* renamed from: k, reason: collision with root package name */
        public static final String f22513k = "touchanchorside";

        /* renamed from: l, reason: collision with root package name */
        public static final String f22514l = "rotationcenterid";

        /* renamed from: m, reason: collision with root package name */
        public static final String f22515m = "touchregionid";

        /* renamed from: n, reason: collision with root package name */
        public static final String f22516n = "limitboundsto";

        /* renamed from: o, reason: collision with root package name */
        public static final String f22517o = "movewhenscrollattop";

        /* renamed from: p, reason: collision with root package name */
        public static final String f22518p = "ontouchup";

        /* renamed from: r, reason: collision with root package name */
        public static final String f22520r = "springboundary";

        /* renamed from: t, reason: collision with root package name */
        public static final String f22522t = "autocompletemode";

        /* renamed from: v, reason: collision with root package name */
        public static final String f22524v = "nestedscrollflags";

        /* renamed from: q, reason: collision with root package name */
        public static final String[] f22519q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* renamed from: s, reason: collision with root package name */
        public static final String[] f22521s = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* renamed from: u, reason: collision with root package name */
        public static final String[] f22523u = {"continuousVelocity", "spring"};

        /* renamed from: w, reason: collision with root package name */
        public static final String[] f22525w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* compiled from: TypedValues.java */
    public interface g {

        /* renamed from: i, reason: collision with root package name */
        public static final int f22534i = 501;

        /* renamed from: j, reason: collision with root package name */
        public static final int f22535j = 502;

        /* renamed from: k, reason: collision with root package name */
        public static final int f22536k = 503;

        /* renamed from: l, reason: collision with root package name */
        public static final int f22537l = 504;

        /* renamed from: m, reason: collision with root package name */
        public static final int f22538m = 505;

        /* renamed from: n, reason: collision with root package name */
        public static final int f22539n = 506;

        /* renamed from: o, reason: collision with root package name */
        public static final int f22540o = 507;

        /* renamed from: p, reason: collision with root package name */
        public static final int f22541p = 508;

        /* renamed from: q, reason: collision with root package name */
        public static final int f22542q = 509;

        /* renamed from: r, reason: collision with root package name */
        public static final int f22543r = 510;

        /* renamed from: a, reason: collision with root package name */
        public static final String f22526a = "KeyPosition";

        /* renamed from: b, reason: collision with root package name */
        public static final String f22527b = "transitionEasing";

        /* renamed from: c, reason: collision with root package name */
        public static final String f22528c = "drawPath";

        /* renamed from: d, reason: collision with root package name */
        public static final String f22529d = "percentWidth";

        /* renamed from: e, reason: collision with root package name */
        public static final String f22530e = "percentHeight";

        /* renamed from: f, reason: collision with root package name */
        public static final String f22531f = "sizePercent";

        /* renamed from: g, reason: collision with root package name */
        public static final String f22532g = "percentX";

        /* renamed from: h, reason: collision with root package name */
        public static final String f22533h = "percentY";

        /* renamed from: s, reason: collision with root package name */
        public static final String[] f22544s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c5;
            str.getClass();
            switch (str.hashCode()) {
                case -1812823328:
                    if (str.equals("transitionEasing")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1127236479:
                    if (str.equals("percentWidth")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1017587252:
                    if (str.equals("percentHeight")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -827014263:
                    if (str.equals("drawPath")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -200259324:
                    if (str.equals("sizePercent")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 428090547:
                    if (str.equals("percentX")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 428090548:
                    if (str.equals("percentY")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return 501;
                case 1:
                    return 503;
                case 2:
                    return 504;
                case 3:
                    return 502;
                case 4:
                    return 505;
                case 5:
                    return f22539n;
                case 6:
                    return 507;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 100) {
                return 2;
            }
            if (i4 == 101) {
                return 8;
            }
            switch (i4) {
                case 501:
                case 502:
                    return 8;
                case 503:
                case 504:
                case 505:
                case f22539n /* 506 */:
                case 507:
                    return 4;
                case f22541p /* 508 */:
                    return 2;
                default:
                    return -1;
            }
        }
    }

    /* compiled from: TypedValues.java */
    public interface h {

        /* renamed from: j, reason: collision with root package name */
        public static final int f22554j = 700;

        /* renamed from: k, reason: collision with root package name */
        public static final int f22555k = 701;

        /* renamed from: l, reason: collision with root package name */
        public static final int f22556l = 702;

        /* renamed from: m, reason: collision with root package name */
        public static final int f22557m = 509;

        /* renamed from: n, reason: collision with root package name */
        public static final int f22558n = 704;

        /* renamed from: o, reason: collision with root package name */
        public static final int f22559o = 705;

        /* renamed from: p, reason: collision with root package name */
        public static final int f22560p = 706;

        /* renamed from: q, reason: collision with root package name */
        public static final int f22561q = 707;

        /* renamed from: a, reason: collision with root package name */
        public static final String f22545a = "Transitions";

        /* renamed from: b, reason: collision with root package name */
        public static final String f22546b = "duration";

        /* renamed from: c, reason: collision with root package name */
        public static final String f22547c = "from";

        /* renamed from: d, reason: collision with root package name */
        public static final String f22548d = "to";

        /* renamed from: e, reason: collision with root package name */
        public static final String f22549e = "pathMotionArc";

        /* renamed from: f, reason: collision with root package name */
        public static final String f22550f = "autoTransition";

        /* renamed from: g, reason: collision with root package name */
        public static final String f22551g = "motionInterpolator";

        /* renamed from: h, reason: collision with root package name */
        public static final String f22552h = "staggered";

        /* renamed from: i, reason: collision with root package name */
        public static final String f22553i = "transitionFlags";

        /* renamed from: r, reason: collision with root package name */
        public static final String[] f22562r = {"duration", "from", "to", "pathMotionArc", "autoTransition", "motionInterpolator", "staggered", "from", "transitionFlags"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c5;
            str.getClass();
            switch (str.hashCode()) {
                case -1996906958:
                    if (str.equals("transitionFlags")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1992012396:
                    if (str.equals("duration")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1357874275:
                    if (str.equals("motionInterpolator")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1298065308:
                    if (str.equals("autoTransition")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3707:
                    if (str.equals("to")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3151786:
                    if (str.equals("from")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1310733335:
                    if (str.equals("pathMotionArc")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1839260940:
                    if (str.equals("staggered")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return f22561q;
                case 1:
                    return f22554j;
                case 2:
                    return f22559o;
                case 3:
                    return f22558n;
                case 4:
                    return f22556l;
                case 5:
                    return f22555k;
                case 6:
                    return 509;
                case 7:
                    return f22560p;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 509) {
                return 2;
            }
            switch (i4) {
                case f22554j /* 700 */:
                    return 2;
                case f22555k /* 701 */:
                case f22556l /* 702 */:
                    return 8;
                default:
                    switch (i4) {
                        case f22559o /* 705 */:
                        case f22561q /* 707 */:
                            return 8;
                        case f22560p /* 706 */:
                            return 4;
                        default:
                            return -1;
                    }
            }
        }
    }

    /* compiled from: TypedValues.java */
    public interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final String f22563a = "KeyTrigger";

        /* renamed from: b, reason: collision with root package name */
        public static final String f22564b = "viewTransitionOnCross";

        /* renamed from: c, reason: collision with root package name */
        public static final String f22565c = "viewTransitionOnPositiveCross";

        /* renamed from: d, reason: collision with root package name */
        public static final String f22566d = "viewTransitionOnNegativeCross";

        /* renamed from: e, reason: collision with root package name */
        public static final String f22567e = "postLayout";

        /* renamed from: f, reason: collision with root package name */
        public static final String f22568f = "triggerSlack";

        /* renamed from: g, reason: collision with root package name */
        public static final String f22569g = "triggerCollisionView";

        /* renamed from: h, reason: collision with root package name */
        public static final String f22570h = "triggerCollisionId";

        /* renamed from: i, reason: collision with root package name */
        public static final String f22571i = "triggerID";

        /* renamed from: j, reason: collision with root package name */
        public static final String f22572j = "positiveCross";

        /* renamed from: k, reason: collision with root package name */
        public static final String f22573k = "negativeCross";

        /* renamed from: l, reason: collision with root package name */
        public static final String f22574l = "triggerReceiver";

        /* renamed from: m, reason: collision with root package name */
        public static final String f22575m = "CROSS";

        /* renamed from: n, reason: collision with root package name */
        public static final String[] f22576n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* renamed from: o, reason: collision with root package name */
        public static final int f22577o = 301;

        /* renamed from: p, reason: collision with root package name */
        public static final int f22578p = 302;

        /* renamed from: q, reason: collision with root package name */
        public static final int f22579q = 303;

        /* renamed from: r, reason: collision with root package name */
        public static final int f22580r = 304;

        /* renamed from: s, reason: collision with root package name */
        public static final int f22581s = 305;

        /* renamed from: t, reason: collision with root package name */
        public static final int f22582t = 306;

        /* renamed from: u, reason: collision with root package name */
        public static final int f22583u = 307;

        /* renamed from: v, reason: collision with root package name */
        public static final int f22584v = 308;

        /* renamed from: w, reason: collision with root package name */
        public static final int f22585w = 309;

        /* renamed from: x, reason: collision with root package name */
        public static final int f22586x = 310;

        /* renamed from: y, reason: collision with root package name */
        public static final int f22587y = 311;

        /* renamed from: z, reason: collision with root package name */
        public static final int f22588z = 312;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c5;
            str.getClass();
            switch (str.hashCode()) {
                case -1594793529:
                    if (str.equals("positiveCross")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -966421266:
                    if (str.equals("viewTransitionOnPositiveCross")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -786670827:
                    if (str.equals("triggerCollisionId")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -648752941:
                    if (str.equals("triggerID")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -638126837:
                    if (str.equals("negativeCross")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -76025313:
                    if (str.equals("triggerCollisionView")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -9754574:
                    if (str.equals("viewTransitionOnNegativeCross")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 64397344:
                    if (str.equals("CROSS")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 364489912:
                    if (str.equals("triggerSlack")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1301930599:
                    if (str.equals("viewTransitionOnCross")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1401391082:
                    if (str.equals("postLayout")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1535404999:
                    if (str.equals("triggerReceiver")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    return 309;
                case 1:
                    return 302;
                case 2:
                    return 307;
                case 3:
                    return 308;
                case 4:
                    return 310;
                case 5:
                    return 306;
                case 6:
                    return 303;
                case 7:
                    return 312;
                case '\b':
                    return 305;
                case '\t':
                    return 301;
                case '\n':
                    return 304;
                case 11:
                    return 311;
                default:
                    return -1;
            }
        }
    }

    int a(String str);

    boolean b(int i4, int i5);

    boolean c(int i4, float f4);

    boolean d(int i4, boolean z4);

    boolean e(int i4, String str);
}
