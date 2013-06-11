package com.myforms.templatefield.dao;

import java.util.List;

import com.myforms.field.config.model.FieldType;
import com.myforms.usergroup.model.User;

public interface TemplateFieldDao {
public List<com.myforms.field.List> getListForUser(User user);
public void saveTemplateList(com.myforms.field.List templateList);
public List<FieldType> getCongigurableFields();
}
