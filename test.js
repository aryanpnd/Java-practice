// interview question (cipher school): load avatar if image's link is broken
// sol: use img attribute "on error"

import {avatar} from "/src"

const main = () => {
    const user = {
        "profile": "string",
        "name": "string",
    }
    return (
        <>
            <Avatar pfp={user.profile} uname={user.name} />
        </>
    )
}


const Avatar = ({ pfp, uname }) => {
    const [profileUrl, setProfileUrl] = useState(true)
    const [username, setUsername] = useState('')
    useEffect(() => {
        if(pfp===undefined || pfp==="_some_regex_checks"){
            setProfileUrl(false)

        }
        else setProfileUrl(true)
    }, [])

    return (
        <>{
            profileUrl?
            <img src={profileUrl}/>:
            <div>{username}</div>
        }
        </>
    )
}