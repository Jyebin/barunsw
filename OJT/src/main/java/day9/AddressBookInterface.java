package day9;

import java.util.List;

public interface AddressBookInterface {
	public List<AddressVO> selectAddressList(AddressVO addressVO);

	public int insertAddress(AddressVO addressVO) throws Exception;

	public int updateAddress(AddressVO addressVO) throws Exception;

	public int deleteAddress(AddressVO addressVO) throws Exception;
}
