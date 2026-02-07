package ac4y.indicator.service.web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ac4y.indicator.service.object.analytics.AnalyticsByHumanIDsRequest;
import ac4y.indicator.service.object.analytics.AnalyticsByHumanIDsResponse;
import ac4y.indicator.service.object.analytics.AnalyticsRequest;
import ac4y.indicator.service.object.analytics.AnalyticsResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByHumanIDsRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByHumanIDsResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByIndicatorRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByIndicatorResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByOriginRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByOriginResponse;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByPersistentIDRequest;
import ac4y.indicator.service.object.delete.DeleteAnalyticsByPersistentIDResponse;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByHumanIDsRequest;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByHumanIDsResponse;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByIndicatorRequest;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByIndicatorResponse;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByPersistentIDRequest;
import ac4y.indicator.service.object.delete.DeleteIndicatorBalanceHistoryByPersistentIDResponse;
import ac4y.indicator.service.object.get.balance.GetBalanceByHumanIDsRequest;
import ac4y.indicator.service.object.get.balance.GetBalanceByHumanIDsResponse;
import ac4y.indicator.service.object.get.balance.GetBalanceRequest;
import ac4y.indicator.service.object.get.balance.GetBalanceResponse;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceByHumanIDsRequest;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceByHumanIDsResponse;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceRequest;
import ac4y.indicator.service.object.get.balance.GetPeriodBalanceResponse;
import ac4y.indicator.service.object.get.minus.GetMinusByHumanIDsRequest;
import ac4y.indicator.service.object.get.minus.GetMinusByHumanIDsResponse;
import ac4y.indicator.service.object.get.minus.GetMinusRequest;
import ac4y.indicator.service.object.get.minus.GetMinusResponse;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusByHumanIDsRequest;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusByHumanIDsResponse;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusRequest;
import ac4y.indicator.service.object.get.minus.GetPeriodMinusResponse;
import ac4y.indicator.service.object.get.plus.GetPlusByHumanIDsRequest;
import ac4y.indicator.service.object.get.plus.GetPlusByHumanIDsResponse;
import ac4y.indicator.service.object.get.plus.GetPlusRequest;
import ac4y.indicator.service.object.get.plus.GetPlusResponse;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListCountRequest;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListCountResponse;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListRequest;
import ac4y.indicator.service.object.list.analytics.GetAnalyticsListResponse;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListByHumanIDsRequest;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListByHumanIDsResponse;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListCountRequest;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListCountResponse;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListRequest;
import ac4y.indicator.service.object.list.analytics.GetIndicatorAnalyticsListResponse;
import ac4y.indicator.service.object.list.analytics.GetOriginAnalyticsListRequest;
import ac4y.indicator.service.object.list.analytics.GetOriginAnalyticsListResponse;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListCountRequest;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListCountResponse;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListRequest;
import ac4y.indicator.service.object.list.balancehistory.GetBalanceHistoryListResponse;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListByHumanIDsRequest;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListByHumanIDsResponse;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListRequest;
import ac4y.indicator.service.object.list.transfer.GetIndicatorTransferListResponse;
import ac4y.indicator.service.object.list.transfer.GetOriginTransferListRequest;
import ac4y.indicator.service.object.list.transfer.GetOriginTransferListResponse;
import ac4y.indicator.service.object.list.transfer.GetTransferListCountRequest;
import ac4y.indicator.service.object.list.transfer.GetTransferListCountResponse;
import ac4y.indicator.service.object.list.transfer.GetTransferListRequest;
import ac4y.indicator.service.object.list.transfer.GetTransferListResponse;
import ac4y.indicator.service.object.maintain.MaintainByHumanIDsRequest;
import ac4y.indicator.service.object.maintain.MaintainByHumanIDsResponse;
import ac4y.indicator.service.object.maintain.MaintainRequest;
import ac4y.indicator.service.object.maintain.MaintainResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByHumanIDsRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByHumanIDsResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByIndicatorRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByIndicatorResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByOriginRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByOriginResponse;
import ac4y.indicator.service.object.storno.StornoAnalyticsByPersistentIDRequest;
import ac4y.indicator.service.object.storno.StornoAnalyticsByPersistentIDResponse;
import ac4y.indicator.service.object.storno.StornoTransferByHumanIDsRequest;
import ac4y.indicator.service.object.storno.StornoTransferByHumanIDsResponse;
import ac4y.indicator.service.object.storno.StornoTransferByIndicatorRequest;
import ac4y.indicator.service.object.storno.StornoTransferByIndicatorResponse;
import ac4y.indicator.service.object.storno.StornoTransferByOriginRequest;
import ac4y.indicator.service.object.storno.StornoTransferByOriginResponse;
import ac4y.indicator.service.object.storno.StornoTransferByPersistentIDRequest;
import ac4y.indicator.service.object.storno.StornoTransferByPersistentIDResponse;
import ac4y.indicator.service.object.transfer.TransferByHumanIDsRequest;
import ac4y.indicator.service.object.transfer.TransferByHumanIDsResponse;
import ac4y.indicator.service.object.transfer.TransferRequest;
import ac4y.indicator.service.object.transfer.TransferResponse;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusByHumanIDsRequest;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusByHumanIDsResponse;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusRequest;
import ac4y.indicator.service.object.get.plus.GetPeriodPlusResponse;

@WebService
@SOAPBinding(style = Style.RPC)

public interface Ac4yIndicatorWebServiceProtocol {

	/*
    @WebMethod(operationName="analytics", action="analytics")
    @WebResult(name="response")
    public AnalyticsResponse analytics(@WebParam(name="request") AnalyticsRequest request);
    */
/*
    @WebMethod(operationName="analyticsByHumanIDs", action="analyticsByHumanIDs")
    @WebResult(name="response")
    public AnalyticsByHumanIDsResponse analyticsByHumanIDs(@WebParam(name="request") AnalyticsByHumanIDsRequest request);
*/
    
/*
    @WebMethod(operationName="deleteAnalyticsByPersistentID", action="deleteAnalyticsByPersistentID")
    @WebResult(name="response")
    public DeleteAnalyticsByPersistentIDResponse deleteAnalyticsByPersistentID(@WebParam(name="request") DeleteAnalyticsByPersistentIDRequest request);

    @WebMethod(operationName="deleteAnalyticsByIndicator", action="deleteAnalyticsByIndicator")
    @WebResult(name="response")
    public DeleteAnalyticsByIndicatorResponse deleteAnalyticsByIndicator(@WebParam(name="request") DeleteAnalyticsByIndicatorRequest request);

    @WebMethod(operationName="deleteAnalyticsByByHumanIDs", action="deleteAnalyticsByByHumanIDs")
    @WebResult(name="response")
    public DeleteAnalyticsByHumanIDsResponse deleteAnalyticsByByHumanIDs(@WebParam(name="request") DeleteAnalyticsByHumanIDsRequest request);

    @WebMethod(operationName="deleteAnalyticsByOrigin", action="deleteAnalyticsByOrigin")
    @WebResult(name="response")
    public DeleteAnalyticsByOriginResponse deleteAnalyticsByOrigin(@WebParam(name="request") DeleteAnalyticsByOriginRequest request);

    

    @WebMethod(operationName="deleteIndicatorBalanceHistoryByPersistentID", action="deleteIndicatorBalanceHistoryByPersistentID")
    @WebResult(name="response")
    public DeleteIndicatorBalanceHistoryByPersistentIDResponse deleteIndicatorBalanceHistoryByPersistentID(@WebParam(name="request") DeleteIndicatorBalanceHistoryByPersistentIDRequest request);

    @WebMethod(operationName="deleteIndicatorBalanceHistoryByIndicator", action="deleteIndicatorBalanceHistoryByIndicator")
    @WebResult(name="response")
    public DeleteIndicatorBalanceHistoryByIndicatorResponse deleteIndicatorBalanceHistoryByIndicator(@WebParam(name="request") DeleteIndicatorBalanceHistoryByIndicatorRequest request);

    @WebMethod(operationName="deleteIndicatorBalanceHistoryByHumanIDs", action="deleteIndicatorBalanceHistoryByHumanIDs")
    @WebResult(name="response")
    public DeleteIndicatorBalanceHistoryByHumanIDsResponse deleteIndicatorBalanceHistoryByHumanIDs(@WebParam(name="request") DeleteIndicatorBalanceHistoryByHumanIDsRequest request);
    */
    
        
    @WebMethod(operationName="stornoAnalyticsByPersistentID", action="stornoAnalyticsByPersistentID")
    @WebResult(name="response")
    public StornoAnalyticsByPersistentIDResponse stornoAnalyticsByPersistentID(@WebParam(name="request") StornoAnalyticsByPersistentIDRequest request);
  /*
    @WebMethod(operationName="stornoAnalyticsByIndicator", action="stornoAnalyticsByIndicator")
    @WebResult(name="response")
    public StornoAnalyticsByIndicatorResponse stornoAnalyticsByIndicator(@WebParam(name="request") StornoAnalyticsByIndicatorRequest request);
*/
    /*
    @WebMethod(operationName="stornoAnalyticsByByHumanIDs", action="stornoAnalyticsByByHumanIDs")
    @WebResult(name="response")
    public StornoAnalyticsByHumanIDsResponse stornoAnalyticsByByHumanIDs(@WebParam(name="request") StornoAnalyticsByHumanIDsRequest request);
    */
/*
    @WebMethod(operationName="stornoAnalyticsByOrigin", action="stornoAnalyticsByOrigin")
    @WebResult(name="response")
    public StornoAnalyticsByOriginResponse stornoAnalyticsByOrigin(@WebParam(name="request") StornoAnalyticsByOriginRequest request);
*/
    /*
    @WebMethod(operationName="stornoTransferByPersistentID", action="stornoTransferByPersistentID")
    @WebResult(name="response")
    public StornoTransferByPersistentIDResponse stornoTransferByPersistentID(@WebParam(name="request") StornoTransferByPersistentIDRequest request);
    */
/*
    @WebMethod(operationName="stornoTransferByIndicator", action="stornoTransferByIndicator")
    @WebResult(name="response")
    public StornoTransferByIndicatorResponse stornoTransferByIndicator(@WebParam(name="request") StornoTransferByIndicatorRequest request);

    @WebMethod(operationName="stornoTransferByByHumanIDs", action="stornoTransferByByHumanIDs")
    @WebResult(name="response")
    public StornoTransferByHumanIDsResponse stornoTransferByByHumanIDs(@WebParam(name="request") StornoTransferByHumanIDsRequest request);
    */
/*
    @WebMethod(operationName="stornoTransferByOrigin", action="stornoTransferByOrigin")
    @WebResult(name="response")
    public StornoTransferByOriginResponse stornoTransferByOrigin(@WebParam(name="request") StornoTransferByOriginRequest request);
*/

    /*
    @WebMethod(operationName="transfer", action="transfer")
    @WebResult(name="response")
    public TransferResponse transfer(@WebParam(name="request") TransferRequest request);
    */
/*
    @WebMethod(operationName="transferByHumanIDs", action="transferByHumanIDs")
    @WebResult(name="response")
    public TransferByHumanIDsResponse transferByHumanIDs(@WebParam(name="request") TransferByHumanIDsRequest request);
*/
/*    
    @WebMethod(operationName="maintain", action="maintain")
    @WebResult(name="response")
    public MaintainResponse maintain(@WebParam(name="request") MaintainRequest request);

    @WebMethod(operationName="maintainByHumanIDs", action="maintainByHumanIDs")
    @WebResult(name="response")
    public MaintainByHumanIDsResponse maintainByHumanIDs(@WebParam(name="request") MaintainByHumanIDsRequest request);

  */  
    @WebMethod(operationName="getBalance", action="getBalance")
    @WebResult(name="response")
    public GetBalanceResponse getBalance(@WebParam(name="request") GetBalanceRequest request);

    @WebMethod(operationName="getPlus", action="getPlus")
    @WebResult(name="response")
    public GetPlusResponse getPlus(@WebParam(name="request") GetPlusRequest request);

    @WebMethod(operationName="getMinus", action="getMinus")
    @WebResult(name="response")
    public GetMinusResponse getMinus(@WebParam(name="request") GetMinusRequest request);

    
    @WebMethod(operationName="getBalanceByHumanIDs", action="getBalanceByHumanIDs")
    @WebResult(name="response")
    public GetBalanceByHumanIDsResponse getBalanceByHumanIDs0(@WebParam(name="request") GetBalanceByHumanIDsRequest request);

    @WebMethod(operationName="getPlusByHumanIDs", action="getPlusByHumanIDs")
    @WebResult(name="response")
    public GetPlusByHumanIDsResponse getPlusByHumanIDs(@WebParam(name="request") GetPlusByHumanIDsRequest request);

    @WebMethod(operationName="getMinusByHumanIDs", action="getMinusByHumanIDs")
    @WebResult(name="response")
    public GetMinusByHumanIDsResponse getMinusByHumanIDs(@WebParam(name="request") GetMinusByHumanIDsRequest request);


    
    
    @WebMethod(operationName="getPeriodBalance", action="getPeriodBalance")
    @WebResult(name="response")
    public GetPeriodBalanceResponse getPeriodBalance(@WebParam(name="request") GetPeriodBalanceRequest request);

    @WebMethod(operationName="getPeriodPlus", action="getPeriodPlus")
    @WebResult(name="response")
    public GetPeriodPlusResponse getPeriodPlus(@WebParam(name="request") GetPeriodPlusRequest request);

    @WebMethod(operationName="getPeriodMinus", action="getPeriodMinus")
    @WebResult(name="response")
    public GetPeriodMinusResponse getPeriodMinus(@WebParam(name="request") GetPeriodMinusRequest request);


    
    @WebMethod(operationName="getPeriodBalanceByHumanIDs", action="getPeriodBalanceByHumanIDs")
    @WebResult(name="response")
    public GetPeriodBalanceByHumanIDsResponse getPeriodBalanceByHumanIDs(@WebParam(name="request") GetPeriodBalanceByHumanIDsRequest request);

    @WebMethod(operationName="getPeriodPlusByHumanIDs", action="getPeriodPlusByHumanIDs")
    @WebResult(name="response")
    public GetPeriodPlusByHumanIDsResponse getPeriodPlusByHumanIDs(@WebParam(name="request") GetPeriodPlusByHumanIDsRequest request);

    @WebMethod(operationName="getPeriodMinusByHumanIDs", action="getPeriodMinusByHumanIDs")
    @WebResult(name="response")
    public GetPeriodMinusByHumanIDsResponse getPeriodMinusByHumanIDs(@WebParam(name="request") GetPeriodMinusByHumanIDsRequest request);

    
    @WebMethod(operationName="getAnalyticsList", action="getAnalyticsList")
    @WebResult(name="response")
    public GetAnalyticsListResponse getAnalyticsList(@WebParam(name="request") GetAnalyticsListRequest request);

    @WebMethod(operationName="getAnalyticsListCount", action="getAnalyticsListCount")
    @WebResult(name="response")
    public GetAnalyticsListCountResponse getAnalyticsListCount(@WebParam(name="request") GetAnalyticsListCountRequest request);

    @WebMethod(operationName="getIndicatorAnalyticsList", action="getIndicatorAnalyticsList")
    @WebResult(name="response")
    public GetIndicatorAnalyticsListResponse getIndicatorAnalyticsList(@WebParam(name="request") GetIndicatorAnalyticsListRequest request);

    @WebMethod(operationName="getIndicatorAnalyticsListCount", action="getIndicatorAnalyticsListCount")
    @WebResult(name="response")
    public GetIndicatorAnalyticsListCountResponse getIndicatorAnalyticsListCount(@WebParam(name="request") GetIndicatorAnalyticsListCountRequest request);

    @WebMethod(operationName="getIndicatorAnalyticsListByHumanIDs", action="getIndicatorAnalyticsListByHumanIDs")
    @WebResult(name="response")
    public GetIndicatorAnalyticsListByHumanIDsResponse getIndicatorAnalyticsListByHumanIDs(@WebParam(name="request") GetIndicatorAnalyticsListByHumanIDsRequest request);

    @WebMethod(operationName="getOriginAnalyticsList", action="getOriginAnalyticsList")
    @WebResult(name="response")
    public GetOriginAnalyticsListResponse getOriginAnalyticsList(@WebParam(name="request") GetOriginAnalyticsListRequest request);


    @WebMethod(operationName="getTransferList", action="getTransferList")
    @WebResult(name="response")
    public GetTransferListResponse getTransferList(@WebParam(name="request") GetTransferListRequest request);

    
	@WebMethod(operationName="getTransferListCount", action="getTransferListCount")
	@WebResult(name="response")
	public GetTransferListCountResponse getTransferListCount(@WebParam(name="request") GetTransferListCountRequest request);

	@WebMethod(operationName="getIndicatorTransferList", action="getIndicatorTransferList")
	@WebResult(name="response")
	public GetIndicatorTransferListResponse getIndicatorTransferList(@WebParam(name="request") GetIndicatorTransferListRequest request);

	@WebMethod(operationName="getIndicatorTransferListByHumanIDs", action="getIndicatorTransferListByHumanIDs")
	@WebResult(name="response")
	public GetIndicatorTransferListByHumanIDsResponse getIndicatorTransferListByHumanIDs(@WebParam(name="request") GetIndicatorTransferListByHumanIDsRequest request);

	@WebMethod(operationName="getOriginTransferList", action="getOriginTransferList")
	@WebResult(name="response")
	public GetOriginTransferListResponse getOriginTransferList(@WebParam(name="request") GetOriginTransferListRequest request);


    @WebMethod(operationName="getBalanceHistoryList", action="getBalanceHistoryList")
    @WebResult(name="response")
    public GetBalanceHistoryListResponse getBalanceHistoryList(@WebParam(name="request") GetBalanceHistoryListRequest request);

    @WebMethod(operationName="getBalanceHistoryListCount", action="getBalanceHistoryListCount")
    @WebResult(name="response")
    public GetBalanceHistoryListCountResponse getBalanceHistoryListCount(@WebParam(name="request") GetBalanceHistoryListCountRequest request);
    
}