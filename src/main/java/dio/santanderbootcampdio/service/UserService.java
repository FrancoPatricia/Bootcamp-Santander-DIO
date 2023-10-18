package dio.santanderbootcampdio.service;

import dio.santanderbootcampdio.domain.model.User;
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
