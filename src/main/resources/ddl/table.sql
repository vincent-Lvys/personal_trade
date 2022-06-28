-- auto-generated definition
create table convertible_bond
(
    `index`                 bigint null,
    bond_id                 text   null,
    bond_nm                 text   null,
    bond_py                 text   null,
    price                   double null,
    increase_rt             double null,
    stock_id                text   null,
    stock_nm                text   null,
    stock_py                text   null,
    sprice                  double null,
    sincrease_rt            double null,
    pb                      double null,
    convert_price           double null,
    convert_value           double null,
    convert_dt              bigint null,
    premium_rt              double null,
    dblow                   double null,
    adjust_condition        text   null,
    sw_cd                   text   null,
    market_cd               text   null,
    btype                   text   null,
    list_dt                 text   null,
    qflag2                  text   null,
    owned                   bigint null,
    hold                    bigint null,
    bond_value              text   null,
    rating_cd               text   null,
    option_value            text   null,
    put_convert_price       double null,
    force_redeem_price      double null,
    convert_amt_ratio       double null,
    fund_rt                 text   null,
    short_maturity_dt       text   null,
    year_left               double null,
    curr_iss_amt            double null,
    volume                  double null,
    svolume                 double null,
    turnover_rt             double null,
    ytm_rt                  double null,
    put_ytm_rt              text   null,
    notes                   text   null,
    noted                   bigint null,
    bond_nm_tip             text   null,
    redeem_icon             text   null,
    last_time               text   null,
    qstatus                 text   null,
    margin_flg              text   null,
    sqflag                  text   null,
    pb_flag                 text   null,
    adj_cnt                 bigint null,
    adj_scnt                text   null,
    convert_price_valid     text   null,
    convert_price_tips      text   null,
    convert_cd_tip          text   null,
    ref_yield_info          text   null,
    adjusted                text   null,
    orig_iss_amt            double null,
    price_tips              text   null,
    redeem_dt               text   null,
    real_force_redeem_price text   null,
    option_tip              text   null,
    volatility_rate         text   null
);

create index ix_convertible_bond_index
    on convertible_bond (`index`);

