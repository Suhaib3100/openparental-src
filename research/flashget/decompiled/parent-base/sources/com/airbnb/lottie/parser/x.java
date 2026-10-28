package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: MaskParser.java */
/* loaded from: classes3.dex */
class x {
    private x() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.airbnb.lottie.model.content.h a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        boolean z4;
        boolean z5;
        cVar.c();
        h.a aVar = null;
        com.airbnb.lottie.model.animatable.h hVar = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        boolean z6 = false;
        while (cVar.f()) {
            String k4 = cVar.k();
            k4.getClass();
            switch (k4.hashCode()) {
                case 111:
                    if (k4.equals(ProtectedSandApp.s("˥"))) {
                        z4 = false;
                        break;
                    }
                    z4 = -1;
                    break;
                case 3588:
                    if (k4.equals(ProtectedSandApp.s("ˤ"))) {
                        z4 = true;
                        break;
                    }
                    z4 = -1;
                    break;
                case 104433:
                    if (k4.equals(ProtectedSandApp.s("ˣ"))) {
                        z4 = 2;
                        break;
                    }
                    z4 = -1;
                    break;
                case 3357091:
                    if (k4.equals(ProtectedSandApp.s("ˢ"))) {
                        z4 = 3;
                        break;
                    }
                    z4 = -1;
                    break;
                default:
                    z4 = -1;
                    break;
            }
            switch (z4) {
                case false:
                    dVar = d.h(cVar, kVar);
                    break;
                case true:
                    hVar = d.k(cVar, kVar);
                    break;
                case true:
                    z6 = cVar.g();
                    break;
                case true:
                    String l4 = cVar.l();
                    l4.getClass();
                    switch (l4.hashCode()) {
                        case 97:
                            if (l4.equals(ProtectedSandApp.s("˩"))) {
                                z5 = false;
                                break;
                            }
                            z5 = -1;
                            break;
                        case 105:
                            if (l4.equals(ProtectedSandApp.s("˨"))) {
                                z5 = true;
                                break;
                            }
                            z5 = -1;
                            break;
                        case 110:
                            if (l4.equals(ProtectedSandApp.s("˧"))) {
                                z5 = 2;
                                break;
                            }
                            z5 = -1;
                            break;
                        case 115:
                            if (l4.equals(ProtectedSandApp.s("˦"))) {
                                z5 = 3;
                                break;
                            }
                            z5 = -1;
                            break;
                        default:
                            z5 = -1;
                            break;
                    }
                    switch (z5) {
                        case false:
                            aVar = h.a.MASK_MODE_ADD;
                            break;
                        case true:
                            kVar.a(ProtectedSandApp.s("ˬ"));
                            aVar = h.a.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            aVar = h.a.MASK_MODE_NONE;
                            break;
                        case true:
                            aVar = h.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("˪") + k4 + ProtectedSandApp.s("˫"));
                            aVar = h.a.MASK_MODE_ADD;
                            break;
                    }
                default:
                    cVar.t();
                    break;
            }
        }
        cVar.e();
        return new com.airbnb.lottie.model.content.h(aVar, hVar, dVar, z6);
    }
}
