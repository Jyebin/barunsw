package day4;

import java.util.List;

public interface AddressBookInterface {
	public List<AddressVO> selectAddressList(AddressVO addressVo) throws Exception;

	public int insertAddress(AddressVO addressVo) throws Exception;

	public int updateAddress(AddressVO addressVo) throws Exception;

	public int deleteAddress(AddressVO addressVo) throws Exception;

}
