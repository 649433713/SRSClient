package driver;

import VO.HotelVO;
import businesslogicservice.hotelinfoblservice.HotelTransferService;
import businesslogicservice.hotelinfoblservice.HotelHotelManagerService;
import businesslogicservice.hotelinfoblservice.HotelCustomerService;
import businesslogicservice.hotelinfoblservice.HotelWebManagerService;

public class HotelInfoBLService_Driver {
	public void drive(HotelTransferService hotelTransferService,HotelHotelManagerService hotelStaffService,HotelCustomerService hotelUserService,HotelWebManagerService hotelWebManagerService) {
		hotelTransferService.findHotel("0001");
		hotelStaffService.modifyHotel(new HotelVO());
		hotelUserService.showHotelInfo("0001");
		hotelUserService.showHotelList("0001");
		hotelWebManagerService.addHotel(new HotelVO());
		hotelWebManagerService.deleteHotel("0001");
		hotelWebManagerService.modifyHotel(new HotelVO());
		hotelWebManagerService.showHotelInfo("0001");
		hotelWebManagerService.showHotelList("0001");
		
	}
}
