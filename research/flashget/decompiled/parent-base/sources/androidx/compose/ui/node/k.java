package androidx.compose.ui.node;

import androidx.compose.ui.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DelegatableNode.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a:\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a0\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u0013\u0010\u000e\u001a0\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b¢\u0006\u0004\b\u0014\u0010\u000e\u001a0\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u0015\u0010\u000e\u001a0\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\u0016\u0010\u000e\u001aA\u0010\u001a\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000e\u001aA\u0010\u001b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000e\u001aK\u0010\u001c\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\n\u001aM\u0010\u001e\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 \"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a3\u0010$\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0017\u0018\u0001*\u00020#*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aA\u0010&\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b&\u0010\u000e\u001aA\u0010'\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u000e\u001aA\u0010(\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u000e\u001aA\u0010)\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u000e\u001a\"\u0010*\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\"\u0010.\u001a\u00020-*\u00020\u00002\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0013\u00101\u001a\u000200*\u00020\u0000H\u0000¢\u0006\u0004\b1\u00102\u001a\u0013\u00104\u001a\u000203*\u00020\u0000H\u0000¢\u0006\u0004\b4\u00105\u001a\u0011\u00107\u001a\u000206*\u00020\u0000¢\u0006\u0004\b7\u00108\u001a\u0011\u0010:\u001a\u000209*\u00020\u0000¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010<\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b<\u0010=\u001a\u0015\u0010?\u001a\u0004\u0018\u00010>*\u00020\u0006H\u0000¢\u0006\u0004\b?\u0010@\u001aA\u0010A\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u001d\u0010C\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0002¢\u0006\u0004\bC\u0010D\"\u0018\u0010G\u001a\u00020\u0003*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/node/j;", "", "mask", "", "includeSelf", "Lkotlin/Function1;", "Landroidx/compose/ui/q$d;", "Lkotlin/k2;", "block", "r", "(Landroidx/compose/ui/node/j;IZLld/l;)V", "j", "(Landroidx/compose/ui/node/j;I)Landroidx/compose/ui/q$d;", "D", "(Landroidx/compose/ui/node/j;ILld/l;)V", "Landroidx/compose/runtime/collection/g;", "node", "c", "(Landroidx/compose/runtime/collection/g;Landroidx/compose/ui/q$d;)V", "v", "F", "z", "x", "T", "Landroidx/compose/ui/node/g1;", "type", "A", "y", "t", "untilType", "B", "(Landroidx/compose/ui/node/j;IILld/l;)V", "", "d", "(Landroidx/compose/ui/node/j;I)Ljava/util/List;", "", "k", "(Landroidx/compose/ui/node/j;I)Ljava/lang/Object;", "E", "w", "C", "G", "g", "(Landroidx/compose/ui/node/j;I)Z", "kind", "Landroidx/compose/ui/node/e1;", "m", "(Landroidx/compose/ui/node/j;I)Landroidx/compose/ui/node/e1;", "Landroidx/compose/ui/node/h0;", "p", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/node/p1;", "q", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/node/p1;", "Landroidx/compose/ui/unit/d;", "n", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/w;", "o", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/unit/w;", "h", "(Landroidx/compose/ui/node/j;)V", "Landroidx/compose/ui/node/c0;", "e", "(Landroidx/compose/ui/q$d;)Landroidx/compose/ui/node/c0;", "f", "(Landroidx/compose/ui/q$d;ILld/l;)V", "l", "(Landroidx/compose/runtime/collection/g;)Landroidx/compose/ui/q$d;", "i", "(Landroidx/compose/ui/node/j;)Z", "isDelegationRoot", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,427:1\n190#1:447\n191#1,6:449\n385#1,6:455\n395#1,2:462\n397#1,8:467\n405#1,9:478\n414#1,8:490\n198#1,3:498\n206#1:501\n207#1,4:503\n385#1,6:507\n395#1,2:514\n397#1,8:519\n405#1,9:530\n414#1,8:542\n212#1,3:550\n58#1:553\n59#1,8:555\n385#1,6:563\n395#1,2:570\n397#1,8:575\n405#1,9:586\n414#1,8:598\n68#1,7:606\n58#1,9:613\n385#1,12:622\n397#1,8:637\n405#1,9:648\n414#1,8:660\n68#1,7:668\n58#1:675\n59#1,8:677\n385#1,6:687\n395#1,2:694\n397#1,8:699\n405#1,9:710\n414#1,8:722\n68#1,7:730\n230#1,5:737\n58#1:742\n59#1,8:744\n385#1,6:752\n395#1,2:759\n397#1,8:764\n405#1,9:775\n414#1,8:787\n68#1,7:795\n230#1,5:802\n58#1:807\n59#1,8:809\n385#1,6:817\n395#1,2:824\n397#1,8:829\n405#1,9:840\n414#1,8:852\n68#1,7:860\n100#1:867\n101#1,15:869\n385#1,6:884\n395#1,2:891\n397#1,8:896\n405#1,9:907\n414#1,8:919\n117#1,8:927\n133#1:935\n134#1:937\n135#1,7:941\n142#1,9:949\n385#1,6:958\n395#1,2:965\n397#1,17:970\n414#1,8:990\n151#1,6:998\n385#1,6:1004\n395#1,2:1011\n397#1,8:1016\n405#1,9:1027\n414#1,8:1039\n133#1:1047\n134#1:1049\n135#1,7:1053\n142#1,9:1061\n385#1,6:1070\n395#1,2:1077\n397#1,8:1082\n405#1,9:1093\n414#1,8:1105\n151#1,6:1113\n163#1:1119\n164#1:1121\n165#1,12:1125\n385#1,6:1137\n395#1,2:1144\n397#1,8:1149\n405#1,9:1160\n414#1,8:1172\n177#1,8:1180\n1#2:428\n1#2:448\n1#2:502\n1#2:554\n1#2:676\n1#2:743\n1#2:808\n1#2:868\n1#2:936\n1#2:1048\n1#2:1120\n492#3,11:429\n48#3:443\n48#3:948\n48#3:1060\n1208#4:440\n1187#4,2:441\n1208#4:444\n1187#4,2:445\n1208#4:475\n1187#4,2:476\n1208#4:527\n1187#4,2:528\n1208#4:583\n1187#4,2:584\n1208#4:645\n1187#4,2:646\n1208#4:707\n1187#4,2:708\n1208#4:772\n1187#4,2:773\n1208#4:837\n1187#4,2:838\n1208#4:904\n1187#4,2:905\n1208#4:938\n1187#4,2:939\n1208#4:1024\n1187#4,2:1025\n1208#4:1050\n1187#4,2:1051\n1208#4:1090\n1187#4,2:1091\n1208#4:1122\n1187#4,2:1123\n1208#4:1157\n1187#4,2:1158\n1208#4:1197\n1187#4,2:1198\n261#5:461\n261#5:513\n261#5:569\n261#5:685\n261#5:686\n261#5:693\n261#5:758\n261#5:823\n261#5:890\n261#5:964\n261#5:1010\n261#5:1076\n261#5:1143\n261#5:1189\n261#5:1191\n261#5:1192\n261#5:1196\n234#6,3:464\n237#6,3:487\n234#6,3:516\n237#6,3:539\n234#6,3:572\n237#6,3:595\n234#6,3:634\n237#6,3:657\n234#6,3:696\n237#6,3:719\n234#6,3:761\n237#6,3:784\n234#6,3:826\n237#6,3:849\n234#6,3:893\n237#6,3:916\n234#6,3:967\n237#6,3:987\n234#6,3:1013\n237#6,3:1036\n234#6,3:1079\n237#6,3:1102\n234#6,3:1146\n237#6,3:1169\n234#6,3:1193\n237#6,3:1200\n72#7:1188\n72#7:1190\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n219#1:447\n219#1:449,6\n220#1:455,6\n220#1:462,2\n220#1:467,8\n220#1:478,9\n220#1:490,8\n219#1:498,3\n226#1:501\n226#1:503,4\n227#1:507,6\n227#1:514,2\n227#1:519,8\n227#1:530,9\n227#1:542,8\n226#1:550,3\n234#1:553\n234#1:555,8\n234#1:563,6\n234#1:570,2\n234#1:575,8\n234#1:586,9\n234#1:598,8\n234#1:606,7\n234#1:613,9\n234#1:622,12\n234#1:637,8\n234#1:648,9\n234#1:660,8\n234#1:668,7\n242#1:675\n242#1:677,8\n245#1:687,6\n245#1:694,2\n245#1:699,8\n245#1:710,9\n245#1:722,8\n242#1:730,7\n254#1:737,5\n254#1:742\n254#1:744,8\n254#1:752,6\n254#1:759,2\n254#1:764,8\n254#1:775,9\n254#1:787,8\n254#1:795,7\n262#1:802,5\n262#1:807\n262#1:809,8\n262#1:817,6\n262#1:824,2\n262#1:829,8\n262#1:840,9\n262#1:852,8\n262#1:860,7\n271#1:867\n271#1:869,15\n271#1:884,6\n271#1:891,2\n271#1:896,8\n271#1:907,9\n271#1:919,8\n271#1:927,8\n276#1:935\n276#1:937\n276#1:941,7\n276#1:949,9\n276#1:958,6\n276#1:965,2\n276#1:970,17\n276#1:990,8\n276#1:998,6\n282#1:1004,6\n282#1:1011,2\n282#1:1016,8\n282#1:1027,9\n282#1:1039,8\n283#1:1047\n283#1:1049\n283#1:1053,7\n283#1:1061,9\n283#1:1070,6\n283#1:1077,2\n283#1:1082,8\n283#1:1093,9\n283#1:1105,8\n283#1:1113,6\n289#1:1119\n289#1:1121\n289#1:1125,12\n290#1:1137,6\n290#1:1144,2\n290#1:1149,8\n290#1:1160,9\n290#1:1172,8\n289#1:1180,8\n219#1:448\n226#1:502\n234#1:554\n242#1:676\n254#1:743\n262#1:808\n271#1:868\n276#1:936\n283#1:1048\n289#1:1120\n127#1:429,11\n141#1:443\n276#1:948\n283#1:1060\n134#1:440\n134#1:441,2\n164#1:444\n164#1:445,2\n220#1:475\n220#1:476,2\n227#1:527\n227#1:528,2\n234#1:583\n234#1:584,2\n234#1:645\n234#1:646,2\n245#1:707\n245#1:708,2\n254#1:772\n254#1:773,2\n262#1:837\n262#1:838,2\n271#1:904\n271#1:905,2\n276#1:938\n276#1:939,2\n282#1:1024\n282#1:1025,2\n283#1:1050\n283#1:1051,2\n283#1:1090\n283#1:1091,2\n289#1:1122\n289#1:1123,2\n290#1:1157\n290#1:1158,2\n404#1:1197\n404#1:1198,2\n220#1:461\n227#1:513\n234#1:569\n243#1:685\n244#1:686\n245#1:693\n254#1:758\n262#1:823\n271#1:890\n276#1:964\n282#1:1010\n283#1:1076\n290#1:1143\n347#1:1189\n353#1:1191\n390#1:1192\n397#1:1196\n220#1:464,3\n220#1:487,3\n227#1:516,3\n227#1:539,3\n234#1:572,3\n234#1:595,3\n234#1:634,3\n234#1:657,3\n245#1:696,3\n245#1:719,3\n254#1:761,3\n254#1:784,3\n262#1:826,3\n262#1:849,3\n271#1:893,3\n271#1:916,3\n276#1:967,3\n276#1:987,3\n282#1:1013,3\n282#1:1036,3\n283#1:1079,3\n283#1:1102,3\n290#1:1146,3\n290#1:1169,3\n396#1:1193,3\n396#1:1200,3\n347#1:1188\n353#1:1190\n*E\n"})
/* loaded from: classes.dex */
public final class k {
    public static final <T> void A(j jVar, int i4, ld.l<? super T, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node");
        }
        q.d node = jVar.getNode();
        if ((node.getAggregateChildKindSet() & i4) != 0) {
            for (q.d child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i4) != 0) {
                    for (q.d dVar = child; dVar != null; dVar = l(null)) {
                        kotlin.jvm.internal.l0.P();
                        lVar.invoke(dVar);
                    }
                }
            }
        }
    }

    public static final <T> void B(j jVar, int i4, int i5, ld.l<? super T, k2> lVar) {
        c1 nodes;
        q.d node = jVar.getNode();
        int i6 = i4 | i5;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d node2 = jVar.getNode();
        h0 p4 = p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i6) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i6) != 0) {
                        if (node2 != node && (node2.getKindSet() & i5) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & i4) != 0) {
                            for (q.d dVar = node2; dVar != null; dVar = l(null)) {
                                kotlin.jvm.internal.l0.P();
                                lVar.invoke(dVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            p4 = p4.B0();
            node2 = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final <T> void C(j jVar, int i4, ld.l<? super T, k2> lVar) {
        for (q.d node = jVar.getNode(); node != null; node = l(null)) {
            kotlin.jvm.internal.l0.P();
            lVar.invoke(node);
        }
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = jVar.getNode().getChild();
        if (child == null) {
            c(gVar, jVar.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & i4) == 0) {
                c(gVar, dVar);
            } else {
                while (true) {
                    if (dVar == null) {
                        break;
                    }
                    if ((dVar.getKindSet() & i4) != 0) {
                        while (dVar != null) {
                            kotlin.jvm.internal.l0.P();
                            lVar.invoke(dVar);
                            dVar = l(null);
                        }
                    } else {
                        dVar = dVar.getChild();
                    }
                }
            }
        }
    }

    public static final void D(@fg.l j jVar, int i4, @fg.l ld.l<? super q.d, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtree called on an unattached node");
        }
        q.d child = jVar.getNode().getChild();
        h0 p4 = p(jVar);
        b1 b1Var = new b1();
        while (p4 != null) {
            if (child == null) {
                child = p4.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i4) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i4) != 0) {
                        lVar.invoke(child);
                    }
                    child = child.getChild();
                }
            }
            b1Var.c(p4.H0());
            child = null;
            p4 = b1Var.a() ? (h0) b1Var.b() : null;
        }
    }

    public static final <T> void E(j jVar, int i4, ld.l<? super T, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtree called on an unattached node");
        }
        q.d child = jVar.getNode().getChild();
        h0 p4 = p(jVar);
        b1 b1Var = new b1();
        while (p4 != null) {
            if (child == null) {
                child = p4.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i4) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i4) != 0) {
                        for (q.d dVar = child; dVar != null; dVar = l(null)) {
                            kotlin.jvm.internal.l0.P();
                            lVar.invoke(dVar);
                        }
                    }
                    child = child.getChild();
                }
            }
            b1Var.c(p4.H0());
            p4 = b1Var.a() ? (h0) b1Var.b() : null;
            child = null;
        }
    }

    public static final void F(@fg.l j jVar, int i4, @fg.l ld.l<? super q.d, Boolean> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = jVar.getNode().getChild();
        if (child == null) {
            c(gVar, jVar.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & i4) != 0) {
                for (q.d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.getChild()) {
                    if ((dVar2.getKindSet() & i4) == 0 || lVar.invoke(dVar2).booleanValue()) {
                    }
                }
            }
            c(gVar, dVar);
        }
    }

    public static final <T> void G(j jVar, int i4, ld.l<? super T, Boolean> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = jVar.getNode().getChild();
        if (child == null) {
            c(gVar, jVar.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & i4) != 0) {
                for (q.d dVar2 = dVar; dVar2 != null; dVar2 = dVar2.getChild()) {
                    if ((dVar2.getKindSet() & i4) != 0) {
                        for (q.d dVar3 = dVar2; dVar3 != null; dVar3 = l(null)) {
                            kotlin.jvm.internal.l0.P();
                            if (!lVar.invoke(dVar3).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            c(gVar, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.runtime.collection.g<q.d> gVar, q.d dVar) {
        androidx.compose.runtime.collection.g<h0> H0 = p(dVar).H0();
        int size = H0.getSize();
        if (size > 0) {
            int i4 = size - 1;
            h0[] L = H0.L();
            do {
                gVar.b(L[i4].getNodes().getHead());
                i4--;
            } while (i4 >= 0);
        }
    }

    public static final <T> List<T> d(j jVar, int i4) {
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d parent = jVar.getNode().getParent();
        h0 p4 = p(jVar);
        ArrayList arrayList = null;
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i4) != 0) {
                        for (q.d dVar = parent; dVar != null; dVar = l(null)) {
                            kotlin.jvm.internal.l0.P();
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(dVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public static final c0 e(@fg.l q.d dVar) {
        if ((dVar.getKindSet() & 2) != 0) {
            if (dVar instanceof c0) {
                return (c0) dVar;
            }
            if (dVar instanceof l) {
                q.d delegate = ((l) dVar).getDelegate();
                while (delegate != 0) {
                    if (delegate instanceof c0) {
                        return (c0) delegate;
                    }
                    delegate = (!(delegate instanceof l) || (delegate.getKindSet() & 2) == 0) ? delegate.getChild() : ((l) delegate).getDelegate();
                }
            }
        }
        return null;
    }

    public static final <T> void f(q.d dVar, int i4, ld.l<? super T, k2> lVar) {
        while (dVar != null) {
            kotlin.jvm.internal.l0.P();
            lVar.invoke(dVar);
            dVar = l(null);
        }
    }

    public static final boolean g(@fg.l j jVar, int i4) {
        return (jVar.getNode().getAggregateChildKindSet() & i4) != 0;
    }

    public static final void h(@fg.l j jVar) {
        if (jVar.getNode().getIsAttached()) {
            h0.W0(p(jVar), false, 1, null);
        }
    }

    public static final boolean i(@fg.l j jVar) {
        return jVar.getNode() == jVar;
    }

    @fg.m
    public static final q.d j(@fg.l j jVar, int i4) {
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("nearestAncestor called on an unattached node");
        }
        q.d parent = jVar.getNode().getParent();
        h0 p4 = p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i4) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    public static final <T> T k(j jVar, int i4) {
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        j parent = jVar.getNode().getParent();
        h0 p4 = p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (parent != null) {
                    if ((((q.d) parent).getKindSet() & i4) != 0) {
                        kotlin.jvm.internal.l0.P();
                        return (T) parent;
                    }
                    parent = (T) ((q.d) parent).getParent();
                }
            }
            p4 = p4.B0();
            parent = (p4 == null || (nodes = p4.getNodes()) == null) ? (T) null : (T) nodes.getTail();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q.d l(androidx.compose.runtime.collection.g<q.d> gVar) {
        if (gVar == null || gVar.U()) {
            return null;
        }
        return (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
    }

    @fg.l
    public static final e1 m(@fg.l j jVar, int i4) {
        e1 coordinator = jVar.getNode().getCoordinator();
        kotlin.jvm.internal.l0.m(coordinator);
        if (coordinator.g3() != jVar || !h1.j(i4)) {
            return coordinator;
        }
        e1 wrapped = coordinator.getWrapped();
        kotlin.jvm.internal.l0.m(wrapped);
        return wrapped;
    }

    @fg.l
    public static final androidx.compose.ui.unit.d n(@fg.l j jVar) {
        return p(jVar).getDensity();
    }

    @fg.l
    public static final androidx.compose.ui.unit.w o(@fg.l j jVar) {
        return p(jVar).getLayoutDirection();
    }

    @fg.l
    public static final h0 p(@fg.l j jVar) {
        e1 coordinator = jVar.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    @fg.l
    public static final p1 q(@fg.l j jVar) {
        p1 owner = p(jVar).getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("This node does not have an owner.");
    }

    public static final void r(@fg.l j jVar, int i4, boolean z4, @fg.l ld.l<? super q.d, k2> lVar) {
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d node = z4 ? jVar.getNode() : jVar.getNode().getParent();
        h0 p4 = p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i4) != 0) {
                        lVar.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            p4 = p4.B0();
            node = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static /* synthetic */ void s(j jVar, int i4, boolean z4, ld.l lVar, int i5, Object obj) {
        c1 nodes;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d node = z4 ? jVar.getNode() : jVar.getNode().getParent();
        h0 p4 = p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i4) != 0) {
                        lVar.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            p4 = p4.B0();
            node = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final <T> void t(j jVar, int i4, boolean z4, ld.l<? super T, k2> lVar) {
        c1 nodes;
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d node = z4 ? jVar.getNode() : jVar.getNode().getParent();
        h0 p4 = p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i4) != 0) {
                        for (q.d dVar = node; dVar != null; dVar = l(null)) {
                            kotlin.jvm.internal.l0.P();
                            lVar.invoke(dVar);
                        }
                    }
                    node = node.getParent();
                }
            }
            p4 = p4.B0();
            node = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static void u(j jVar, int i4, boolean z4, ld.l lVar, int i5, Object obj) {
        c1 nodes;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        q.d node = z4 ? jVar.getNode() : jVar.getNode().getParent();
        h0 p4 = p(jVar);
        while (p4 != null) {
            if ((androidx.compose.ui.focus.a.a(p4) & i4) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i4) != 0) {
                        for (q.d dVar = node; dVar != null; dVar = l(null)) {
                            kotlin.jvm.internal.l0.P();
                            lVar.invoke(dVar);
                        }
                    }
                    node = node.getParent();
                }
            }
            p4 = p4.B0();
            node = (p4 == null || (nodes = p4.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final void v(@fg.l j jVar, int i4, @fg.l ld.l<? super q.d, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = jVar.getNode().getChild();
        if (child == null) {
            c(gVar, jVar.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & i4) == 0) {
                c(gVar, dVar);
            } else {
                while (true) {
                    if (dVar == null) {
                        break;
                    }
                    if ((dVar.getKindSet() & i4) != 0) {
                        lVar.invoke(dVar);
                        break;
                    }
                    dVar = dVar.getChild();
                }
            }
        }
    }

    public static final <T> void w(j jVar, int i4, ld.l<? super T, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
        q.d child = jVar.getNode().getChild();
        if (child == null) {
            c(gVar, jVar.getNode());
        } else {
            gVar.b(child);
        }
        while (gVar.V()) {
            q.d dVar = (q.d) androidx.compose.foundation.gestures.i.a(gVar, 1);
            if ((dVar.getAggregateChildKindSet() & i4) == 0) {
                c(gVar, dVar);
            } else {
                while (true) {
                    if (dVar == null) {
                        break;
                    }
                    if ((dVar.getKindSet() & i4) != 0) {
                        while (dVar != null) {
                            kotlin.jvm.internal.l0.P();
                            lVar.invoke(dVar);
                            dVar = l(null);
                        }
                    } else {
                        dVar = dVar.getChild();
                    }
                }
            }
        }
    }

    public static final void x(@fg.l j jVar, int i4, @fg.l ld.l<? super q.d, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (q.d parent = jVar.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i4) != 0) {
                lVar.invoke(parent);
            }
        }
    }

    public static final <T> void y(j jVar, int i4, ld.l<? super T, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (q.d parent = jVar.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i4) != 0) {
                for (q.d dVar = parent; dVar != null; dVar = l(null)) {
                    kotlin.jvm.internal.l0.P();
                    lVar.invoke(dVar);
                }
            }
        }
    }

    public static final void z(@fg.l j jVar, int i4, @fg.l ld.l<? super q.d, k2> lVar) {
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node");
        }
        q.d node = jVar.getNode();
        if ((node.getAggregateChildKindSet() & i4) == 0) {
            return;
        }
        for (q.d child = node.getChild(); child != null; child = child.getChild()) {
            if ((child.getKindSet() & i4) != 0) {
                lVar.invoke(child);
            }
        }
    }
}
