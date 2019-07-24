package cn.zerohy.easy.excel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @Author hyuan
 * @Date 2019-07-24 22:50
 * @Description TODO
 */
@Data
public class AbcRecord extends BaseRowModel {
    @ExcelProperty(index = 0)
    private String transDate;
    @ExcelProperty(index = 1)
    private String transTime;
    @ExcelProperty(index = 2)
    private String amount;
    @ExcelProperty(index = 3)
    private Double balance;
    @ExcelProperty(index = 4)
    private String otherPartyName;
    @ExcelProperty(index = 5)
    private String otherPartyAccount;
    @ExcelProperty(index = 6)
    private String transBank;
    @ExcelProperty(index = 7)
    private String transChannel;
    @ExcelProperty(index = 8)
    private String transWay;
    @ExcelProperty(index = 9)
    private String transUse;
    @ExcelProperty(index = 10)
    private String transSummary;
}
