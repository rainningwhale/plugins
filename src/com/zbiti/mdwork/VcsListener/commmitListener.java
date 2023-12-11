//package com.zbiti.mdwork.VcsListener;
//
//import com.intellij.openapi.actionSystem.AnAction;
//import com.intellij.openapi.actionSystem.AnActionEvent;
//import com.intellij.openapi.vcs.AbstractVcs;
//
//import com.intellij.openapi.vcs.checkin.CheckinHandlerFactory;
//import com.intellij.openapi.vcs.checkin.CheckinHandlerUtil;
//import com.intellij.openapi.vcs.ui.RefreshableOnComponent;
//
//
///**
// * 功能描述
// *
// * @author hzh
// * @date 2023/12/11  2:05 PM
// */
//public class commitListener extends AnAction {
//
//    @Override
//    public void actionPerformed(AnActionEvent e) {
//        // 在这里触发你的自定义弹窗
//        System.out.println("触发");
//    }
//
////    private static class CustomCheckinHandlerFactory extends CheckinHandlerFactory {
////        @Override
////        public RefreshableOnComponent createVcsCommitHandler(AbstractVcs abstractVcs) {
////            return new VcsCheckinHandler() {
////                @Override
////                public ReturnResult beforeCheckin() {
////                    // 在这里触发你的自定义弹窗
////                    System.out.println("12345");
////                    return CheckinHandlerUtil.ReturnResult.COMMIT;
////                }
////            };
////        }
////    }
//}
