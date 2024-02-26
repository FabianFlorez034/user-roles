INSERT INTO ROLES(role_name)
SELECT 'ADMIN'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'ADMIN'
);

INSERT INTO ROLES(role_name)
SELECT 'USER'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'USER'
);



INSERT INTO USERS(given_name, family_name, nickname, name, picture, locale, updated_at, email, email_verified, sub)
VALUES ('name', 'familyName', 'nickname', 'FABIAN', 'https://lh3.googleusercontent.com/a/ACg8ocLonU6EjgaiIggat5gbgvo7DI93z73zqSuOnA3Ql1nz=s96-c',
        'en', '2024-01-23T16:20:59.472Z', 'ingefabianflorez@gmail.com', true, 'google-oauth2|111591162365369678758');
INSERT INTO USER_ROLE(role_id, user_id) VALUES (1, 1);
INSERT INTO USER_ROLE(role_id, user_id) VALUES (2, 1);