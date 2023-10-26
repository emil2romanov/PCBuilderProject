package bg.softuni.pcbuilder.service;

import bg.softuni.pcbuilder.model.dto.user.UserLoginBindingModel;
import bg.softuni.pcbuilder.model.dto.user.UserRegisterBindingModel;

public interface UserService {

    boolean register(UserRegisterBindingModel userRegisterBindingModel);

    boolean login(UserLoginBindingModel userLoginBindingModel);

    void logout();
}

