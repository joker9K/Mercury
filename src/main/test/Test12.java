package main.test;

/**
 * @author zhangwt
 * @date 2017/8/15 17:35.
 */
public class Test12 {

    public static void main(String[] args) {
        String s = null;
        for(int i=0;i<100;i++){

            String k = null;
            if(i<10){
                k = "0"+i;
            }else {
                k = ""+i;
            }
            s = "CREATE TABLE `t_alipay_contacts_"+k+"` (\n" +
                    "  `id` bigint(32) NOT NULL AUTO_INCREMENT,\n" +
                    "  `createTime` datetime DEFAULT NULL,\n" +
                    "  `lastModifyTime` datetime DEFAULT NULL,\n" +
                    "  `userId` varchar(32) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `realName` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',\n" +
                    "  `account` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '账号',\n" +
                    "  `mappingId` varchar(32) COLLATE utf8_bin NOT NULL,\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  UNIQUE KEY `idx_mappingId_userId` (`userId`,`mappingId`) USING BTREE,\n" +
                    "  KEY `idx_mappingId` (`mappingId`) USING BTREE\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;";
            System.out.println(s);
        }
    }
}
