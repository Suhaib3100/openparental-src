package com.google.zxing.pdf417.encoder;

import androidx.constraintlayout.core.motion.utils.w;
import androidx.core.view.h0;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.WriterException;
import com.luck.picture.lib.config.PictureConfig;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.rtmp.TXLivePushConfig;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: PDF417ErrorCorrection.java */
/* loaded from: classes6.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f63261a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, UserData.IS91_MSG_TYPE_CLI, 295, 116, 442, 428, 295, 42, SyslogAppender.LOG_LOCAL6, 65}, new int[]{361, 575, 922, 525, SyslogAppender.LOG_LOCAL6, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE, 571, 320, 803, UserData.IS91_MSG_TYPE_SHORT_MESSAGE, 231, 390, 685, 330, 63, HttpStatus.SC_GONE}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, w.e.f22502z, 287, 107, 505, 733, 877, 381, w.e.B, 723, 476, 462, 172, 430, w.e.f22501y, 858, 822, 543, 376, 511, 400, 672, 762, 283, SyslogAppender.LOG_LOCAL7, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, w.e.f22497u, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 822, 93, 217, 208, ta.a.f91897b, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, w.h.f22558n, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, w.e.f22498v, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, w.e.f22494r, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, w.b.f22443o, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, w.e.f22497u, 540, 913, 801, w.h.f22554j, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, SyslogAppender.LOG_LOCAL1, 538, w.b.f22444p, 90, 2, 290, 743, EventResult.ERROR_CODE_OTHER, 655, w.b.f22441m, 329, 49, 802, 580, 355, 588, PictureConfig.CHOOSE_REQUEST, 462, 10, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 628, 320, 479, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, 739, 71, 263, w.a.f22421s, 374, 601, 192, w.e.f22497u, 142, 673, 687, 234, 722, 384, 177, 752, w.e.f22499w, 640, 455, 193, 689, w.h.f22561q, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, w.e.f22501y, 441, 180, 791, 893, 754, w.e.f22497u, 383, 228, 749, 760, 213, 54, 297, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 54, 834, 299, 922, 191, 910, 532, w.e.f22501y, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, HttpStatus.SC_CONFLICT, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, HttpStatus.SC_REQUEST_TIMEOUT, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, h0.f27183j, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, w.e.f22502z, 384, SyslogAppender.LOG_LOCAL5, 190, 826, 328, 596, 786, 303, 570, 381, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, SyslogAppender.LOG_LOCAL5, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, w.h.f22561q, 94, 8, 494, 114, 521, 2, 499, 851, 543, SyslogAppender.LOG_LOCAL3, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, w.b.f22440l, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, HttpStatus.SC_REQUEST_TIMEOUT, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, HttpStatus.SC_EXPECTATION_FAILED, 158, 209, 563, 564, 343, 693, 109, w.e.f22500x, 563, 365, 181, 772, 677, 310, 248, 353, 708, HttpStatus.SC_GONE, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, SyslogAppender.LOG_LOCAL7, 45, 787, 680, 18, 66, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, w.b.f22443o, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, h0.f27183j, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, w.c.f22467w, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, w.b.f22443o, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, w.c.f22467w, 535, 336, 286, 437, 375, 273, w.e.f22502z, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, w.a.f22419q, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, w.a.f22419q, 486, 721, w.e.f22502z, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, HttpStatus.SC_LENGTH_REQUIRED, 877, 669, 141, 919, 45, 780, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, HttpStatus.SC_GONE, 389, 244, 31, 121, 303, 263}};

    private f() {
    }

    static String a(CharSequence charSequence, int i4) {
        int b5 = b(i4);
        char[] cArr = new char[b5];
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = b5 - 1;
            int charAt = (charSequence.charAt(i5) + cArr[i6]) % ta.a.f91896a;
            while (i6 > 0) {
                cArr[i6] = (char) ((cArr[i6 - 1] + (929 - ((f63261a[i4][i6] * charAt) % ta.a.f91896a))) % ta.a.f91896a);
                i6--;
            }
            cArr[0] = (char) ((929 - ((charAt * f63261a[i4][0]) % ta.a.f91896a)) % ta.a.f91896a);
        }
        StringBuilder sb = new StringBuilder(b5);
        for (int i7 = b5 - 1; i7 >= 0; i7--) {
            char c5 = cArr[i7];
            if (c5 != 0) {
                cArr[i7] = (char) (929 - c5);
            }
            sb.append(cArr[i7]);
        }
        return sb.toString();
    }

    static int b(int i4) {
        if (i4 < 0 || i4 > 8) {
            throw new IllegalArgumentException(ProtectedSandApp.s("న\u0001"));
        }
        return 1 << (i4 + 1);
    }

    static int c(int i4) throws WriterException {
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ప\u0001"));
        }
        if (i4 <= 40) {
            return 2;
        }
        if (i4 <= 160) {
            return 3;
        }
        if (i4 <= 320) {
            return 4;
        }
        if (i4 <= 863) {
            return 5;
        }
        throw new WriterException(ProtectedSandApp.s("\u0c29\u0001"));
    }
}
