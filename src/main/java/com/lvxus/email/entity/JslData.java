package com.lvxus.email.entity;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * lyu_convertible_bond
 * @author 
 */
@Data
@Entity
@Table(name = "convertible_bond")
public class JslData implements Serializable {
    /**
     * 标识
     */
    @Id
    private Long index;

    /**
     * 债券代码
     */
    private String bondId;

    /**
     * 债券名称
     */
    private String bondNm;

    /**
     * 债券编码
     */
    private String bondPy;

    /**
     * 债券当前价
     */
    private Double price;

    /**
     * 涨跌幅
     */
    private Double increaseRt;

    /**
     * 正股代码
     */
    private String stockId;

    /**
     * 正股名称
     */
    private String stockNm;

    /**
     * 正股编码
     */
    private String stockPy;

    /**
     * 正股当前价
     */
    private Double sprice;

    /**
     * 正股正跌幅
     */
    private Double sincreaseRt;

    /**
     * 正股PB
     */
    private Double pb;

    /**
     * 转股价
     */
    private Double convertPrice;

    /**
     * 转股价值
     */
    private Double convertValue;

    private Long convertDt;

    /**
     * 溢价率
     */
    private Double premiumRt;

    /**
     * 双低值
     */
    private Double dblow;

    /**
     * 下修条件
     */
    private String adjustCondition;

    private String swCd;

    private String marketCd;

    private String btype;

    private String listDt;

    private String qflag2;

    private Long owned;

    private Long hold;

    private String bondValue;

    private String ratingCd;

    private String optionValue;

    private Double putConvertPrice;

    private Double forceRedeemPrice;

    private Double convertAmtRatio;

    private String fundRt;

    private String shortMaturityDt;

    private Double yearLeft;

    /**
     * 剩余规模(亿)
     */
    private Double currIssAmt;

    private Double volume;

    private Double svolume;

    private Double turnoverRt;

    /**
     * 到期税前收益率
     */
    private Double ytmRt;

    private String putYtmRt;

    private String notes;

    private Long noted;

    private String bondNmTip;

    private String redeemIcon;

    private String lastTime;

    private String qstatus;

    private String marginFlg;

    private String sqflag;

    private String pbFlag;

    private Long adjCnt;

    private String adjScnt;

    private String convertPriceValid;

    private String convertPriceTips;

    private String convertCdTip;

    private String refYieldInfo;

    private String adjusted;

    private Double origIssAmt;

    private String priceTips;

    private String redeemDt;

    private String realForceRedeemPrice;

    private String optionTip;

    private String volatilityRate;

    private static final long serialVersionUID = 1L;
}