package ac4y.indicator.service.web;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ac4y.indicator.service.object.Ac4yIndicatorObjectService;
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

@WebService(endpointInterface = "ac4y.indicator.service.web.Ac4yIndicatorWebServiceProtocol")
public class Ac4yIndicatorWebService implements Ac4yIndicatorWebServiceProtocol {

	private static final Logger LOG = LogManager.getLogger(Ac4yIndicatorWebService.class);

	/*
	@Override
	public MaintainResponse maintain(MaintainRequest request) {
		return new Ac4yIndicatorObjectService().maintain(request);
	}

	@Override
	public MaintainByHumanIDsResponse maintainByHumanIDs(MaintainByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().maintainByHumanIDs(request);
	}
*/
	@Override
	public GetBalanceResponse getBalance(GetBalanceRequest request) {

		return new Ac4yIndicatorObjectService().getBalance(request);
	}

	@Override
	public GetPlusResponse getPlus(GetPlusRequest request) {
		return new Ac4yIndicatorObjectService().getPlus(request);
	}

	@Override
	public GetMinusResponse getMinus(GetMinusRequest request) {
		return new Ac4yIndicatorObjectService().getMinus(request);
	}

	@Override
	public GetBalanceByHumanIDsResponse getBalanceByHumanIDs0(GetBalanceByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getBalanceByHumanIDs(request);
	}

	@Override
	public GetPlusByHumanIDsResponse getPlusByHumanIDs(GetPlusByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getPlusByHumanIDs(request);
	}

	@Override
	public GetMinusByHumanIDsResponse getMinusByHumanIDs(GetMinusByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getMinusByHumanIDs(request);
	}

	@Override
	public GetPeriodBalanceResponse getPeriodBalance(GetPeriodBalanceRequest request) {
		return new Ac4yIndicatorObjectService().getPeriodBalance(request);
	}

	@Override
	public GetPeriodPlusResponse getPeriodPlus(GetPeriodPlusRequest request) {
		return new Ac4yIndicatorObjectService().getPeriodPlus(request);
	}

	@Override
	public GetPeriodMinusResponse getPeriodMinus(GetPeriodMinusRequest request) {
		return new Ac4yIndicatorObjectService().getPeriodMinus(request);
	}

	@Override
	public GetPeriodBalanceByHumanIDsResponse getPeriodBalanceByHumanIDs(GetPeriodBalanceByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getPeriodBalanceByHumanIDs(request);
	}

	@Override
	public GetPeriodPlusByHumanIDsResponse getPeriodPlusByHumanIDs(GetPeriodPlusByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getPeriodPlusByHumanIDs(request);
	}

	@Override
	public GetPeriodMinusByHumanIDsResponse getPeriodMinusByHumanIDs(GetPeriodMinusByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getPeriodMinusByHumanIDs(request);
	}

	@Override
	public GetAnalyticsListResponse getAnalyticsList(GetAnalyticsListRequest request) {
		return new Ac4yIndicatorObjectService().getAnalyticsList(request);
	}

	@Override
	public GetTransferListResponse getTransferList(GetTransferListRequest request) {

		LOG.info(request.getAsJson());
		LOG.info(new Ac4yIndicatorObjectService().getTransferList(request).getAsJson());

		return new Ac4yIndicatorObjectService().getTransferList(request);


	}

	@Override
	public GetBalanceHistoryListResponse getBalanceHistoryList(GetBalanceHistoryListRequest request) {
		return new Ac4yIndicatorObjectService().getBalanceHistoryList(request);
	}
/*
	@Override
	public DeleteAnalyticsByPersistentIDResponse deleteAnalyticsByPersistentID(
			DeleteAnalyticsByPersistentIDRequest request) {
		return new Ac4yIndicatorObjectService().deleteAnalyticsByPersistentID(request);
	}

	@Override
	public DeleteAnalyticsByIndicatorResponse deleteAnalyticsByIndicator(DeleteAnalyticsByIndicatorRequest request) {
		return new Ac4yIndicatorObjectService().deleteAnalyticsByIndicator(request);
	}

	@Override
	public DeleteAnalyticsByHumanIDsResponse deleteAnalyticsByByHumanIDs(DeleteAnalyticsByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().deleteAnalyticsByByHumanIDs(request);
	}

	@Override
	public DeleteAnalyticsByOriginResponse deleteAnalyticsByOrigin(DeleteAnalyticsByOriginRequest request) {
		return new Ac4yIndicatorObjectService().deleteAnalyticsByOrigin(request);
	}

	@Override
	public DeleteIndicatorBalanceHistoryByPersistentIDResponse deleteIndicatorBalanceHistoryByPersistentID(
			DeleteIndicatorBalanceHistoryByPersistentIDRequest request) {
		return new Ac4yIndicatorObjectService().deleteIndicatorBalanceHistoryByPersistentID(request);
	}

	@Override
	public DeleteIndicatorBalanceHistoryByIndicatorResponse deleteIndicatorBalanceHistoryByIndicator(
			DeleteIndicatorBalanceHistoryByIndicatorRequest request) {
		return new Ac4yIndicatorObjectService().deleteIndicatorBalanceHistoryByIndicator(request);
	}

	@Override
	public DeleteIndicatorBalanceHistoryByHumanIDsResponse deleteIndicatorBalanceHistoryByHumanIDs(
			DeleteIndicatorBalanceHistoryByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().deleteIndicatorBalanceHistoryByHumanIDs(request);
	}
*/
	@Override
	public StornoAnalyticsByPersistentIDResponse stornoAnalyticsByPersistentID(
			StornoAnalyticsByPersistentIDRequest request) {

		StornoAnalyticsByPersistentIDResponse response = new StornoAnalyticsByPersistentIDResponse();

		try {
			response = new Ac4yIndicatorObjectService().stornoAnalyticsByPersistentID(request);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return response;

	} // stornoAnalyticsByPersistentID
/*
	@Override
	public StornoAnalyticsByIndicatorResponse stornoAnalyticsByIndicator(StornoAnalyticsByIndicatorRequest request) {
		return new Ac4yIndicatorObjectService().stornoAnalyticsByIndicator(request);
	}

	@Override
	public StornoAnalyticsByHumanIDsResponse stornoAnalyticsByByHumanIDs(StornoAnalyticsByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().stornoAnalyticsByByHumanIDs(request);
	}

	@Override
	public StornoAnalyticsByOriginResponse stornoAnalyticsByOrigin(StornoAnalyticsByOriginRequest request) {
		return new Ac4yIndicatorObjectService().stornoAnalyticsByOrigin(request);
	}

	@Override
	public StornoTransferByPersistentIDResponse stornoTransferByPersistentID(
			StornoTransferByPersistentIDRequest request) {
		return new Ac4yIndicatorObjectService().stornoTransferByPersistentID(request);
	}
	*/
/*
	@Override
	public StornoTransferByIndicatorResponse stornoTransferByIndicator(StornoTransferByIndicatorRequest request) throws JAXBException {
		return new Ac4yIndicatorObjectService().stornoTransferByIndicator(request);
	}
*/
	/*
	@Override
	public StornoTransferByHumanIDsResponse stornoTransferByByHumanIDs(StornoTransferByHumanIDsRequest request) throws JAXBException {
		return new Ac4yIndicatorObjectService().stornoTransferByByHumanIDs(request);
	}
	*/
/*
	@Override
	public StornoTransferByOriginResponse stornoTransferByOrigin(StornoTransferByOriginRequest request) throws JAXBException {
		return new Ac4yIndicatorObjectService().stornoTransferByOrigin(request);
	}
*/
	@Override
	public GetAnalyticsListCountResponse getAnalyticsListCount(GetAnalyticsListCountRequest request) {
		return new Ac4yIndicatorObjectService().getAnalyticsListCount(request);
	}

	@Override
	public GetIndicatorAnalyticsListResponse getIndicatorAnalyticsList(GetIndicatorAnalyticsListRequest request) {
		return new Ac4yIndicatorObjectService().getIndicatorAnalyticsList(request);
	}

	@Override
	public GetIndicatorAnalyticsListCountResponse getIndicatorAnalyticsListCount(
			GetIndicatorAnalyticsListCountRequest request) {
		return new Ac4yIndicatorObjectService().getIndicatorAnalyticsListCount(request);
	}

	@Override
	public GetIndicatorAnalyticsListByHumanIDsResponse getIndicatorAnalyticsListByHumanIDs(
			GetIndicatorAnalyticsListByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getIndicatorAnalyticsListByHumanIDs(request);
	}

	@Override
	public GetOriginAnalyticsListResponse getOriginAnalyticsList(GetOriginAnalyticsListRequest request) {
		return new Ac4yIndicatorObjectService().getOriginAnalyticsList(request);
	}

	@Override
	public GetTransferListCountResponse getTransferListCount(GetTransferListCountRequest request) {
		return new Ac4yIndicatorObjectService().getTransferListCount(request);
	}

	@Override
	public GetIndicatorTransferListResponse getIndicatorTransferList(GetIndicatorTransferListRequest request) {
		return new Ac4yIndicatorObjectService().getIndicatorTransferList(request);
	}

	@Override
	public GetIndicatorTransferListByHumanIDsResponse getIndicatorTransferListByHumanIDs(
			GetIndicatorTransferListByHumanIDsRequest request) {
		return new Ac4yIndicatorObjectService().getIndicatorTransferListByHumanIDs(request);
	}

	@Override
	public GetOriginTransferListResponse getOriginTransferList(GetOriginTransferListRequest request) {
		return new Ac4yIndicatorObjectService().getOriginTransferList(request);
	}

	@Override
	public GetBalanceHistoryListCountResponse getBalanceHistoryListCount(GetBalanceHistoryListCountRequest request) {
		return new Ac4yIndicatorObjectService().getBalanceHistoryListCount(request);
	}

}