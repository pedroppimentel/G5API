/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

import br.unesp.soo.grupocinco.model.User;

/**
 *
 * @author pedroppimentel
 */
public interface UserDAO {

    final String INSERT_USER = "INSERT INTO public.usuario "
            + "(nome, sobrenome, email, id_perfil, id_status) "
            + "VALUES(?, ?, ?, ?, ?);";

    final String UPDATE_USER = "UPDATE public.usuario "
            + "SET nome=?, sobrenome=?, email=?, id_perfil=?, id_status=? "
            + "WHERE id=?;";

    final String FIND_USER_BY_ID = "SELECT id, nome, sobrenome, email, id_perfil, id_status "
            + "FROM public.usuario WHERE id=?";

    final String FIND_USER_BY_USERNAME = "SELECT id, nome, sobrenome, email, id_perfil, id_status "
            + "FROM public.usuario as u"
            + "INNER JOIN public.credencial as c ON c.id_usuario = u.id"
            + "WHERE c.username=?;";

    public boolean create(User user);

    public boolean update(User user);

    public User findById(Long idUser);

    public User findByUsername(String username);
}
