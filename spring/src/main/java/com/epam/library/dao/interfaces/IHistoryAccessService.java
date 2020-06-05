package com.epam.library.dao.interfaces;

import com.epam.library.business.exceptions.UserOperationException;
import com.epam.library.entities.History;
import com.epam.library.entities.User;

import java.util.List;
import java.util.UUID;

public interface IHistoryAccessService extends IBaseAccessService<History> {
    List<History> getUserHistory(User user);
}
