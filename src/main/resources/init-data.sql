INSERT INTO users (age,email,lastname,password,username)
VALUES
    (32,'admin@mail.sru','FamilyAdmin','$2a$12$Z8j8MrD.Kd0OxsvT6hDHfuSGcsTMLo.VHBJDWmI3IeS0AUtUKCdV6','admin'),
    (12,'user@mail.sru','FamilyUser','$2a$12$4AIvPxmrt9fUgt3FYY20gesTbMAM84k7Dp.itrfDV8HAaT/7GC51u','user');



INSERT INTO roles (role)
VALUES
('ADMIN'),
('USER');


INSERT INTO users_roles (users_id,roles_id)
VALUES
(1,1),
(2,2);