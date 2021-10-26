package com.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mchange.v2.lang.StringUtils;
import com.springboot.dto.SapConfig;
import com.springboot.dto.UrlDTO;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 吴金才
 * @Description *
 * @date 2021/9/16 9:11 下午
 */
@RestController
public class HelloController {
    public static void main(String[] args) {
        String config = "{\n" +
                "    \"baseUrl\":\"https://testesb.holatek.cn/ecsb/gw/soa/rf\",\n" +
                "    \"username\":\"CU_QAS\",\n" +
                "    \"password\":\"PfjfaHoMYBbrprZ\\\\HgKBvgDbpQtPokqk6NYeSGGq\",\n" +
                "    \"StandardSalesOrder\":\"OR\",\n" +
                "    \"SalesOrganization\":\"1000\",\n" +
                "    \"DistributionChannel\":\"20\",\n" +
                "    \"OrganizationDivision\":\"00\",\n" +
                "    \"SalesOffice\":\"Z016\",\n" +
                "    \"SalesGroup\":\"P01\",\n" +
                "    \"Customer\":\"300180\",\n" +
                "    \"Currency\":\"CNY\",\n" +
                "    \"SalesOrderAudtiStatus\":\"Y3\",\n" +
                "    \"OrderSource\":\"有赞直营店\",\n" +
                "    \"IsReplace\":\"Y\",\n" +
                "    \"NotReplace\":\"N\",\n" +
                "    \"ItemCategory\":\"TAN\",\n" +
                "    \"ProductPlantReplace\":\"1000\",\n" +
                "    \"ProductPlantNotReplace\":\"1000\",\n" +
                "    \"customerReturnType\":\"CBRE\",\n" +
                "    \"sDDocumentReason\":\"001\",\n" +
                "    \"customerReturnItemCategory\":\"RENV\",\n" +
                "    \"retMatlInspResultCode\":\"0001\",\n" +
                "    \"CustRetItmFollowUpActivity\":\"0002\",\n" +
                "    \"returnsMaterialHasBeenReceived\":\"X\",\n" +
                "    \"returnsRefundProcgMode\":\"P\",\n" +
                "    \"yy1FdSfdfSdi\":\"Y\",\n" +
                "    \"purchaseOrderType\":\"NB\",\n" +
                "    \"companyCode\":\"1200\",\n" +
                "    \"createdByUser\":\"CB0000000002\",\n" +
                "    \"purchasingGroup\":\"B04\",\n" +
                "    \"purchasingOrganization\":\"1200\",\n" +
                "    \"supplier\":\"1000\",\n" +
                "    \"invoiceIsExpected\":true,\n" +
                "    \"invoiceIsGoodsReceiptBased\":true,\n" +
                "    \"plant\":\"1200\",\n" +
                "    \"purchaseOrderItem\":\"10\",\n" +
                "    \"ConditionType\":\"PPR0\",\n" +
                "    \"discountConditionType\":\"ZP00\",\n" +
                "    \"GoodsMovementRefDocType\":\"B\",\n" +
                "    \"GoodsMovementType\":\"101\",\n" +
                "    \"goodsMovementCode\":\"01\",\n" +
                "    \"isPreOrder\":true,\n" +
                "    \"virtualWarehouseCode\":\"A801\",\n" +
                "    \"supplierCode\":\"1000\",\n" +
                "    \"NotReplaceStorageLocation\":\"3301\",\n" +
                "    \"ReplaceStorageLocation\":\"A802\",\n" +
                "    \"OrganizationCode\":\"0036000000\",\n" +
                "    \"SystemCode\":\"0036000005\",\n" +
                "    \"AppCode\":\"0036000005000G\",\n" +
                "    \"supplyingPlant\":\"1000\",\n" +
                "    \"AppAccessToken\":\"b384a2a3ed794e10b42ce44a3ba8b9f5\",\n" +
                "    \"defaultPurchasePrice\":\"1\",\n" +
                "    \"extOrderType\":\"10\"\n" +
                "}";
        SapConfig sapConfig = JSONObject.parseObject(config,SapConfig.class);
        System.out.println(JSONObject.toJSONString(sapConfig));
    }
}
